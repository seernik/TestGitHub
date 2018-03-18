package com.company.lesson24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo6 {


    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("", "2332", null, "dfdf"));
        words.removeIf(new Predicate<String>() {
            public boolean test(String t) {
                return t == null || t.isEmpty();
            }
        });
        System.out.println(words);
    }
}