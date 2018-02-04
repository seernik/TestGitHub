package com.company;

public class Printer1Demo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("prrrrrinting");
            }
        };
        printable.print();
    }
}
