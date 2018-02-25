package com.company.lesson17;

public class NewThreat extends Thread{
    @Override
    public void run() {
        for (int i=1;i<101;i++){
            System.out.println("© "+i+" © " + currentThread().getName());
        }
    }

    public static void main(String[] args) {

    }
}
