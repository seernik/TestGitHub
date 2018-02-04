//package com.company.lesson13;
//
//import java.util.Objects;
//
//public class User2 {
//    @Override
//    public String toString() {
//        return "User{" +
//                "login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof User2)) return false;
//        User2 user = (User2) o;
//        return Objects.equals(login, user.login) &&
//                Objects.equals(password, user.password);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(login, password);
//    }
//
//    public User2(String login, String password) {
//        this.login = login;
//        this.password = password;
//    }
//
//    public String getLogin() {
//        return login;
//
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    private String login, password;
//
//}
//
//    public void createQuerry(String name) {
//    name = "asdsda";
//        class Querry {
//            public void printToLog() {
//                System.out.printf("User %s with password %s send request \n", login, password);
//                Querry querry = new Querry();
//                querry.printToLog();
//            }
//        }
//
//        public static void main(String[] args) {
//            User2 user = new User2("sisadmin", "password");
//            user.createQuerry("dsfs");
//
//        }
//    }
//
