package com.raven.streams.interview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 222, 24, 98, 230, 73, -45, 54, 60, 22, 30, 29);

//        List<Integer> number = new ArrayList<>();
//        integerList.forEach(e -> {
//            integerList.forEach(e1 -> {
//                if (Objects.equals(e, e1)) {
//                    number.add(e);
//                }
//            });
//        });
//        System.out.println(number);

        // distinct elements
        System.out.println(integerList.stream()
                .filter(e -> Collections.frequency(integerList, e) == 1)
                .collect(Collectors.toList())
        );

        // duplicate elements
        System.out.println(integerList.stream()
                .filter(e -> Collections.frequency(integerList, e) > 1)
                .collect(Collectors.toSet())
        );

//        System.out.println(new HashSet<>(integerList));
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> duplicates = integerList.stream()
                .filter(e -> !numbers.add(e))
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
