package com.company.lesson17;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i =0; i<101001;i++){
            if (i%10 == 0) {
                System.out.println(i);
            }
        }
    }
}
