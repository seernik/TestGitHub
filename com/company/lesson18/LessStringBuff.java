package com.company.lesson18;

public class LessStringBuff extends Thread {
    StringBuffer stringBuffer;

    public LessStringBuff(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    @Override
    public void run() {
        synchronized (stringBuffer) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuffer);
            }
            System.out.println();
            char letter = stringBuffer.charAt(0);
            stringBuffer.setCharAt(0, ++letter);
        }
    }


}
