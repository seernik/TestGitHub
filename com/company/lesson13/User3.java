package com.company.lesson13;

import java.util.Objects;

public class User3 {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User3 user = (User3) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password);
    }

    public static String getLogin() {
        return login;

    }

    public static String getPassword() {
        return password;
    }

    private static String login="login",password="password";
    public static class Querry{
        public void printToLog(){
            System.out.printf("User %s with password %s send request \n",login,password);
        }
    }

    public static void main(String[] args) {
        User3.Querry querry = new User3.Querry();
        querry.printToLog();
        Querry querry1 = new Querry();
        querry1.printToLog();
//        User user = new User("sisadmin","password");
//        user3.createQuerry();
//        User.Querry querry1 = user.new Querry();
//        querry1.printToLog();
//        User.Querry querry2 = new User("sisad","pass").new Querry();
//        querry2.printToLog();
    }
}

