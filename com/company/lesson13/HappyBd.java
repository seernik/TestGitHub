package com.company.lesson13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class HappyBd {
    public static void main(String[] args) {
        Calendar d1 = new GregorianCalendar(1986, 12, 19);
        DateFormat dfa = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
        System.out.println(dfa.format(d1.getTime()));
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale locale : locales) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println(locale + "---> " + df.format(d1));
        }
//        dfa[0] = DateFormat.getInstance();
//        dfa[1] = DateFormat.getDateInstance();
//        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
//        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
//        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
//        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
//        for (DateFormat df : dfa) {
//            System.out.println(df.format(d1));
    }
}

