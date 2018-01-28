package com.company.Lesson12;

import java.util.Formatter;

public class FormatNew {
    public static void main(String[] args) {
        declar("Bill", 5, "nature");
    }

    public static void declar(String fio, int mark, String subj) {
        Formatter f = new Formatter();
//        f.format("%-15s get mark %3d on subject %-10s", fio, mark, subj);
//        System.out.println(f);
        System.out.printf("%-15s get mark %3d on subject %-10s", fio, mark, subj);
    }
}

