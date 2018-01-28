package com.company.Lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDem {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher("ccccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
