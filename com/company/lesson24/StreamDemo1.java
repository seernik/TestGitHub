package com.company.lesson24;

import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
//        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
//                .map(String::length)
//                .filter(i -> i > 3)
//                .limit(2)
//                .forEach(System.out::println);
        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
                .map(str -> {
                    System.out.println("Mapping: " + str);
                    return str.length();
                })
                .filter(i -> {
                    System.out.println("Filtering: " + i);
                    return i > 3;
                })
                .limit(2)
                .forEach(System.out::println);

    }

}
