//package com.company.lesson22;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PhoneDAO extends AbstractDAO<Integer, Phone> {
//    public static final String SQL_SELECT_ALL_PHONES = "SELECT * FROM phonenumbers";
//    public static final String SQL_SELECT_USER_ID = "SELECT * FROM phonenumbers WHERE id=?";
//
//
//
//    @Override
//    public List<Phone> findAll() {
//        List<Phone> phones = new ArrayList<>();
//        try (Connection connection = ConnectorDB.getConnection();
//             Statement statement = connection.createStatement()) {
//            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_PHONES);
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                int user_id = rs.getInt(2);
//                String phone_number = rs.getString(3);
//                phones.add(new Phone(id, user_id, phone_number));
//            }
//        } catch (SQLException e) {
//            System.err.println("SQL Exeption (request or table failed):" + e);
//        }
//        return phones;
//    }
//
////    @Override
//////    public Phone findEntityById(Integer id) {
//////        Phone phone = null;
//////        try (Connection connection = ConnectorDB.getConnection();
//////             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_USER_ID)) {
//////            statement.setInt(1, id);
//////            ResultSet rs = statement.executeQuery();
//////            if (rs.next()) {
//////                id = rs.getInt(1);
//////                //user_id = rs.getInt(2);
//////                String phone_number = rs.getString(2);
//////                phone = new Phone(id, user_id, phone_number);
////            }
////        } catch (SQLException e) {
////            System.err.println("SQL Exeption (request or table failed):" + e);
////        }
////        return phone;
////    }
//
//    @Override
//    public boolean delete(Integer id) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public boolean delete(Phone entity) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public boolean create(Phone entity) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public Phone update(Phone entity) {
//        throw new UnsupportedOperationException();
//    }
//}
