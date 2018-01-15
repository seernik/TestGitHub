package com.company;

public class Phone {
    private String model;
    private long number;
    private double weight;
    private static int count =0;

    Phone() {
    }



    public Phone(String str, long l, double doub) {
        this(str, l);
        this.weight = doub;
        count++;
    }

    public Phone(String str, long l) {
        model = str;
        number = l;
        weight = 100000;
        count++;
    }

    static int getCountInstance(){return count;}

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
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    protected void finalize() {
        System.out.println("In finalize");
        count--;
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