package javamarathon.javacore.jdbc.repository;

import javamarathon.javacore.jdbc.conection.ConnectionFactory;
import javamarathon.javacore.jdbc.domain.Producer;
import javamarathon.javacore.jdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        List<Producer> producers = new ArrayList<>();

        try (JdbcRowSet jdbcRowSet = ConnectionFactory.getConnectionRowSet()) {
            jdbcRowSet.addRowSetListener(new CustomRowSetListener());
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setString(1, String.format("%%%s%%", name));
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                Producer producer = Producer.builder()
                        .id(jdbcRowSet.getInt("id"))
                        .name(jdbcRowSet.getString("name"))
                        .build();

                producers.add(producer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE (`id` = ?)";
        try (JdbcRowSet jdbcRowSet = ConnectionFactory.getConnectionRowSet()) {
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setInt(1, producer.getId());
            jdbcRowSet.execute();

            if (!jdbcRowSet.next()) return;
            jdbcRowSet.updateString("name", producer.getName());
            jdbcRowSet.updateRow();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE (`id` = ?)";
        try (CachedRowSet crs = ConnectionFactory.getCachedRowSet();
             Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);

            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            TimeUnit.SECONDS.sleep(10); // da problema de concorrencia se você alterar no db enquanto a thread main está dormindo.
            crs.acceptChanges();

        } catch (SQLException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
