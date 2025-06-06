package org.example.ormcoursework.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    private final Connection connection;

    private DBConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/serenity_mental_health_therapy_center?createDatabaseIfNotExist=true";
        String USER = "root";
        String PASSWORD = "1234";
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static DBConnection getInstance() throws SQLException {
        return instance == null ? instance = new DBConnection() : instance;
    }
}
