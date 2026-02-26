package javamarathon.javacore.jdbc.repository;

import javamarathon.javacore.jdbc.conection.ConnectionFactory;
import javamarathon.javacore.jdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import javax.print.attribute.standard.MediaSize;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?)";
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, producer.getName());
            ps.executeQuery();
            int rowsAffected = ps.executeUpdate(sql);

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
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?)";
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, producer.getName());
            ps.setInt(2, producer.getId());
            ps.executeQuery();

            int rowsAffected = ps.executeUpdate();
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
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        List<Producer> producers = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
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
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", metaData.getTableName(i));
                log.info("Column name '{}'", metaData.getColumnName(i));
                log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", metaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void showDbMetadata() {
        log.info("Showing db metadata");

        try (Connection connection = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetadata = connection.getMetaData();
            if (dbMetadata.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetadata.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }

                if (dbMetadata.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                    log.info("Supports TYPE_SCROLL_INSENSITIVE");
                    if (dbMetadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                        log.info("And supports CONCUR_UPDATABLE");
                    }
                }

                if (dbMetadata.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                    log.info("Supports TYPE_SCROLL_SENSITIVE");
                    if (dbMetadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                        log.info("And supports CONCUR_UPDATABLE");
                    }
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            log.info("Last row? '{}'", rs.last());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")));

            log.info("-------------------");

            log.info("First row? '{}'", rs.first());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")));

            log.info("-------------------");

            log.info("Row relative? '{}'", rs.relative(1));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")));

            log.info("-------------------");

            rs.beforeFirst();
            while (rs.next()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")));
            }

            log.info("-------------------");

            log.info("Is after last? '{}'", rs.isAfterLast());

            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")));

            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding name and updating");
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        List<Producer> producers = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {


            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
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

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding name and inserting if not found");
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        List<Producer> producers = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
                log.info("This producer already exists: '{}'", producers);

                return producers;
            }

            rs.moveToInsertRow();
            rs.updateString("name", name);
            rs.insertRow();
            rs.beforeFirst();
            rs.next();

            Producer producer = Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build();

            producers.add(producer);
            log.info("This producer was successfully created: '{}'", producers);

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding name and deleting.");
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

            ps.setString(1, String.format("%%%s%%", name));
            ResultSet rs = ps.executeQuery();

            boolean found = false;
            while (rs.next()) {
                log.info("This row was successfully deleted.");
                rs.deleteRow();
                found = true; //
            }

            if (!found) {
                log.info("Could not delete: Producer '{}' not found.", name);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static List<Producer> findByNamePrepareStatement(String name) {
        log.info("Finding name and updating");
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        List<Producer> producers = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);) {

            ps.setString(1, String.format("%%%s%%", name));
            ResultSet rs = ps.executeQuery();

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
        log.info("Producer(s): {}'", producers);
        return producers;
    }
}