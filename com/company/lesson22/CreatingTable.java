package com.company.lesson22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.company.lesson22.ConnectionData1.PASSWORD;
import static com.company.lesson22.ConnectionData1.USER;
import static com.company.lesson22.ConnectionData1.DB;

public class CreatingTable {
    private static final String CREATE_DATABASE_QUERY =
            "CREATE DATABASE IF NOT EXISTS " + DB;

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mysql",
                    //+ "?autoReconnect=true&useSSL=false"
                    USER, PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE us "
                            + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                            + " username VARCHAR(50), "
                            + "PRIMARY KEY(id));");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
