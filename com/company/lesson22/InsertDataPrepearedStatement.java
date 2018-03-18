package com.company.lesson22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static com.company.lesson22.ConnectionData.DRIVER;
import static com.company.lesson22.ConnectionData.URL;
import static com.company.lesson22.ConnectionData.USER;
import static com.company.lesson22.ConnectionData.PASSWORD;

public class InsertDataPrepearedStatement {
    private static final String INSERT_QUERY =
            "INSERT INTO phonenumbers (phone_number) VALUES (?);";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setInt(1,2);
            preparedStatement.setString(1, "55555555");
            preparedStatement.addBatch();

            preparedStatement.setInt(1,1);
            preparedStatement.setString(1,"66666666");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
