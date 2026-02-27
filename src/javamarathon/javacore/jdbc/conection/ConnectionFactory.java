package javamarathon.javacore.jdbc.conection;

import javamarathon.javacore.jdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String user = "root";
        String password = "root";


        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static JdbcRowSet getConnectionRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String user = "root";
        String password = "root";


        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();

        jdbcRowSet.addRowSetListener(new CustomRowSetListener());
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(user);
        jdbcRowSet.setPassword(password);


        return jdbcRowSet;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String user = "root";
        String password = "root";


        CachedRowSet jdbcRowSet = RowSetProvider.newFactory().createCachedRowSet();

        jdbcRowSet.addRowSetListener(new CustomRowSetListener());
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(user);
        jdbcRowSet.setPassword(password);


        return jdbcRowSet;
    }
}
