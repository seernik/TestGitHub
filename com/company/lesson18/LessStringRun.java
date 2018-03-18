package com.company.lesson18;

public class LessStringRun {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");

        LessString thread1 = new LessString(stringBuilder);
        LessString thread2 = new LessString(stringBuilder);
        LessString thread3 = new LessString(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}



