package com.company.lesson24;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.empty();
        Optional<Integer> optional2 = Optional.of(5);
        Optional<Integer> optional3 = Optional.ofNullable(7);

        optional1.ifPresent(System.out::println);
        optional2.ifPresent(System.out::println);
        optional3.ifPresent(System.out::println);

        if (optional1.isPresent()){
            System.out.println(optional1);
        }
        if (optional2.isPresent()){
            System.out.println(optional2);
        }
        if (optional3.isPresent()){
            System.out.println(optional3);
        }
       System.out.println(optional1.orElse(666));
        System.out.println(optional2.orElse(777));
        System.out.println(optional3.get());
        System.out.println(optional1.filter(s ->s > 4).orElse(99999999));
        System.out.println(optional2.filter(s ->s > 4).orElse(99999999));
        System.out.println(optional3.filter(s ->s > 4).orElse(99999999));


    }

}
