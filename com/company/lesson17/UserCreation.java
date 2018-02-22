package com.company.lesson17;

public class UserCreation {
    public static void main(String[] args) {


          isCorrect("login", "pass", "pass");
          isCorrect("login1234567890123456789", "pass", "pass");
            isCorrect("Logon", "passwprd1111111111111111", "passwprd1111111111111111");
            isCorrect("Logon", "pass", "passwprd");


//        isCorrect("Logon", "pass", "passwprd");
        System.out.println("end of program");
    }
    public static boolean isCorrect(String login, String password, String passconf){
        try {
            if (login.length()>20){
                throw new WrongLoginException("Login error");
            }
            if (password.length()>20 || !password.equals(passconf)){
                throw  new WrongPasswordException("Password incorrect");
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
