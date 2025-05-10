package com.raven.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);

        // Create a Stream pipeline to retrieve the first n elements from a list of elements.
        // LIMIT
        List<Integer> limitList = integerList.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(limitList);

        // Create a Stream pipeline that adds the first n elements from a list of elements.
        int limitSum = integerList.stream()
                .limit(5)
                .reduce((a, b) -> (a + b))
                .get();
        System.out.println(limitSum);

        // Create a Stream pipeline to retrieve all the elements after n number of elements from a list of elements.
        // SKIP
        List<Integer> skipList = integerList.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(skipList);

        // Create a Stream pipeline to sum all elements after the nth element from a list of elements.
        int skipSum = integerList.stream()
                .skip(5)
                .reduce((a, b) -> (a + b))
                .get();
        System.out.println(skipSum);

        // Create a Stream pipeline to choose the first n elements from a list of elements.
        // Then, after n elements, retrieve all of them from the list.
        List<Integer> subList = integerList.stream()
                .limit(10)
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(subList);

        //
        subList = integerList.stream()
                .skip(integerList.size() - 5)
                .collect(Collectors.toList());
        System.out.println(subList);
    }
}
