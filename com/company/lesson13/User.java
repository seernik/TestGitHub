package com.company.lesson13;

import java.util.Objects;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password);
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;

    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String login,password;
    public class Querry{
    public void printToLog(){
        System.out.printf("User %s with password %s send request \n",login,password);
    }
    }
    public void createQuerry(){
        Querry querry = new Querry();
        querry.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("sisadmin","password");
        user.createQuerry();
        User.Querry querry1 = user.new Querry();
        querry1.printToLog();
        User.Querry querry2 = new User("sisad","pass").new Querry();
        querry2.printToLog();
    }
}

