package com.raven.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SquareAverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 9, 5, 6, 8, 7);

        Function<Integer, Integer> squareFunction = e -> e * e;

        // square of number
        List<Integer> squareNumber = integerList.stream()
                .map(e -> e * e)
                .collect(Collectors.toList());
        System.out.println("Square of numbers = " + squareNumber);

        // sum of all the squared numbers
        Optional<Integer> squareSum = integerList.stream()
                .map(e -> squareFunction.apply(e))
                .reduce((a, b) -> (a + b));
        System.out.println("Sum of the square of numbers = " + squareSum.get());

        // filter of squared numbers
        List<Integer> squareFilter = integerList.stream()
                .map(squareFunction::apply)
                .filter(e -> e > 30)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Filter of the square of numbers = " + squareFilter);

        // average of square numbers
        double average = integerList.stream()
                .map(squareFunction)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println("Average of the square of numbers = " + average);
    }
}
