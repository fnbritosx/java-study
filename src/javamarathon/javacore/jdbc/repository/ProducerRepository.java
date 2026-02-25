package javamarathon.javacore.jdbc.repository;

import javamarathon.javacore.jdbc.conection.ConnectionFactory;
import javamarathon.javacore.jdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}' in database", producer.getName(), e);
        }
    }

    public static void delete(int... ids) {
        String formattedIds = Arrays.stream(ids)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));

        String sql = "DELETE FROM producer WHERE id IN (%s);".formatted(formattedIds);

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' in the database, rows affected '{}'", formattedIds, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}' in database", formattedIds, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{}', rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}' in database", producer.getId(), e);
        }
    }

    public static List<Producer> findAll() {
        String sql = "SELECT id, name FROM anime_store.producer;";
      return findByName("");
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding all producers");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);

            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void showProducerMetadata() {
        log.info("Showing producer metadata");
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <=columnCount ; i++) {
                log.info("Table name '{}'", metaData.getTableName(i));
                log.info("Column name '{}'", metaData.getColumnName(i));
                log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", metaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }
}
