package com.company.lesson22;

import java.util.function.Predicate;

public class PredikateDemo1 {
    public static void main(String[] args) {
        String str = "fgeogineognmeorhm";
        String str1 = null;
        Predicate<String> isNotNull = s -> s != null;
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        Predicate<String> predicate = isNotEmpty.and(isNotNull);
        Predicate<String> startWithG = s -> s.startsWith("G");
        Predicate<String> startWithN = s -> s.startsWith("N");
        Predicate<String> endWithA = s -> s.endsWith("A");
        Predicate<String> or = startWithG.or(startWithN);
        System.out.println(isNotNull.test(str));
        System.out.println(isNotNull.test(str1));
        System.out.println(isNotEmpty.test(str));
        System.out.println(isNotEmpty.test(""));
        System.out.println(predicate.test(str));
        System.out.println(isNotEmpty.and(isNotNull).test(str));
        System.out.println(or.and(endWithA).test("GAVA"));

    }
}


