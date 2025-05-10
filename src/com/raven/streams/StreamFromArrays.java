package com.raven.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFromArrays {
    public static void main(String[] args) {
        Integer[] squareSeries = {1, 4, 9, 16, 25, 36, 49};
        Arrays.stream(squareSeries)
                .forEach(i -> System.out.println(Thread.currentThread().getName() + ": " + i));

        // parallel stream
        Arrays.stream(squareSeries).parallel()
                .forEach(i -> System.out.println(Thread.currentThread().getName() + ": " + i));

        // stream form part of array
        Arrays.stream(squareSeries, 3, squareSeries.length - 1)
                .forEach(i -> System.out.println(Thread.currentThread().getName() + ": " + i));
    }
}
