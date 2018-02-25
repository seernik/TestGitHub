package com.company.lesson17;

public class MyThreat {
    public static void main(String[] args) {
        NewThreat newThreat1 = new NewThreat();
        NewThreat newThreat2 = new NewThreat();
        NewThreat newThreat3 = new NewThreat();
        newThreat1.start();
        newThreat2.start();
        newThreat3.start();
    }
}
