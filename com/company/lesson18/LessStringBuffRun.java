package com.company.lesson18;

public class LessStringBuffRun {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("A");

        LessStringBuff thread1 = new LessStringBuff(stringBuffer);
        LessStringBuff thread2 = new LessStringBuff(stringBuffer);
        LessStringBuff thread3 = new LessStringBuff(stringBuffer);
        LessStringBuff thread4 = new LessStringBuff(stringBuffer);
        LessStringBuff thread5 = new LessStringBuff(stringBuffer);
        LessStringBuff thread6 = new LessStringBuff(stringBuffer);
        LessStringBuff thread7 = new LessStringBuff(stringBuffer);
        LessStringBuff thread8 = new LessStringBuff(stringBuffer);
        LessStringBuff thread9 = new LessStringBuff(stringBuffer);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
    }
}



