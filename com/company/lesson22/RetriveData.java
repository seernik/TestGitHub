package com.company.lesson22;

import java.sql.*;

import static com.company.lesson22.ConnectionData.PASSWORD;
import static com.company.lesson22.ConnectionData.USER;
import static com.company.lesson22.ConnectionData.DB;
import static com.company.lesson22.ConnectionData.DRIVER;
import static com.company.lesson22.ConnectionData.URL;

public class RetriveData {
    private static final String SELECT_QUERY = "SELECT * FROM users;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            System.out.printf("%-20s%s%n", "id", "username");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                System.out.printf("%-20d%s%n", id, name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

