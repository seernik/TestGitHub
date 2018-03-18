package com.company.lesson24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> words = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> stream = words.stream();
        System.out.println(stream.count());
        Stream<Integer> stream1 = Stream.of(1,2,3,3,4,5,3,4,6,3);
                Integer[] numbers = {1,2,3,4,5,6,7,3,2,65,54,4,3,7};
                stream1.distinct().forEach(System.out::print);
        System.out.println();
        Stream<Integer> stream2 = Stream.of(numbers);
        stream2.filter(t -> t>4).forEach(System.out::print);
        System.out.println();
    }

}
