package com.movexa.prison.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataStore {
    private String url;
    private String user;
    private String password;
    private Connection connection;

    public DataStore(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, user, password);
        }
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    // Additional methods for data management can be added here
}