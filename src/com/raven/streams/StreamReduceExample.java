package com.raven.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
