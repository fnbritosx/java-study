package javamarathon.javacore.jdbc.repository;

import javamarathon.javacore.jdbc.conection.ConnectionFactory;
import javamarathon.javacore.jdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()) {
            int i = stmt.executeUpdate(sql);
            System.out.println(i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
