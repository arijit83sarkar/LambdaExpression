package com.raven.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);

        List<Integer> sortedAscending = integerList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedAscending);

        List<Integer> sortedDescending = integerList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedDescending);
    }
}
