package com.company.lesson22;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        String str="235";

        Function<String,Integer> function = str1 -> {
            try {
                return Integer.valueOf(str1);
            } catch (NumberFormatException e) {
                return 0;
            }
        };
        System.out.println(function.apply(str));
        System.out.println(function.apply("abcd"));
    }
}
