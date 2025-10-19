package org.example.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TasteFind;encrypt=true;trustServerCertificate=true";
    private static final String USER = "Hagila\\חגילה";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}