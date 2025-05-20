package com.raven.streams.interview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 22, 24, 29, 30, 73, -45, 54, 60, 22, 30, 29);

        // List<Integer> number = new ArrayList<>();
        // integerList.forEach(e -> {
        // integerList.forEach(e1 -> {
        // if (Objects.equals(e, e1)) {
        // number.add(e);
        // }
        // });
        // });
        // System.out.println(number);

        // Create a Stream pipeline to select distinct elements from a list of elements
        // that includes duplicates.
        Set<Integer> distinctList = integerList.stream()
                .collect(Collectors.toSet());
        System.out.println("#1 -> " + distinctList);

        distinctList = new HashSet<>(integerList);
        System.out.println("#2 -> " + distinctList);

        distinctList = integerList.stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("#3 -> " + distinctList);

        List<Integer> nonDuplicate = integerList.stream()
                .filter(e -> Collections.frequency(integerList, e) == 1)
                .collect(Collectors.toList());
        System.out.println(nonDuplicate);

        // Make a Stream pipeline to extract duplicates from a list of elements.
        Set<Integer> duplicates = integerList.stream()
                .filter(e -> Collections.frequency(integerList, e) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

        // System.out.println(new HashSet<>(integerList));
        Set<Integer> numbers = new HashSet<>();
        duplicates = integerList.stream()
                .filter(e -> !numbers.add(e))
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
