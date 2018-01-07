package com.company;

public class Phone {
    String model;
    long number;
    double weight;

    Phone() {
    }

    public Phone(String str, long l, double doub) {
        this(str, l);
        this.weight = doub;
    }

    public Phone(String str, long l) {
        model = str;
        number = l;
        weight = 100000;
    }

    public void recieveCall(long n) {
        System.out.println("Calling " + n);
    }

    public void recieveCall(long n, String str) {
        System.out.println("Calling " + n + " Name " + str);
    }

    public void sendSms(String... array) {
        System.out.print("Sending to next phones:  \n");
        for (String i : array) {
            System.out.print(" " + i + "\n");
        }
    }
//    public Phone(String model) {
//    this.model = model;
//    }
//
//    public Phone(long number, double weight) {
//        this.number = number;
//        this.weight = weight;
//    }
}