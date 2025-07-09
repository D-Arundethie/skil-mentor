package com.skillmentor.root.util;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DatabaseConnection {
    private final String URL = "jdbc:mysql://localhost:3306/skill_mentor";
    private final String username = "root";
    private final String password = "1234";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection(URL, username, password);
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
