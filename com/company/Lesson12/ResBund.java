package com.company.Lesson12;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResBund {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");
        printInfo("uk", "UA");
        printInfo("enд", "US");
    }

    private static void printInfo(String language, String country)
            throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-5"),"ISO-8859-5");
            System.out.println(value);
        }
        System.out.println();
    }
}
