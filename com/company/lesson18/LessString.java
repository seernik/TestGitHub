package com.company.lesson18;

public class LessString extends Thread {
    StringBuilder stringBuilder;

    public LessString(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuilder);
            }
            System.out.println();
            char letter = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++letter);
        }
    }


}
