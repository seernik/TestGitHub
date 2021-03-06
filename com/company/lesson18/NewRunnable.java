package com.company.lesson18;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
