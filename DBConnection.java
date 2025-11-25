package com.example.inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // SQLite DB file in repo root when run locally
    private static final String URL = "jdbc:sqlite:inventory.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
