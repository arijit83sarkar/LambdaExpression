package com.raven.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLowestNumber {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);

        // HIGHEST NUMBER
        int highest = integerList.stream()
                        .sorted(Collections.reverseOrder())
                        .distinct()
                        .limit(1)
                        .findFirst()
                        .get();
        System.out.println("Highest number :: " + highest);

        highest = integerList.stream()
                        .sorted(Collections.reverseOrder())
                        .distinct()
                        .limit(2)
                        .skip(1)
                        .findFirst()
                        .get();
        System.out.println("Second highest number :: " + highest);

        // LOWEST NUMBER
        int lowest = integerList.stream()
                        .sorted()
                        .distinct()
                        .limit(1)
                        .findFirst()
                        .get();
        System.out.println("Smallest number :: " + lowest);

        lowest = integerList.stream()
                        .sorted()
                        .distinct()
                        .limit(2)
                        .skip(1)
                        .findFirst()
                        .get();
        System.out.println("Second smallest number :: " + lowest);

        List<String> stringList = Arrays.asList("java", "microservice", "spring boot", "spring mvc", "spring framework");

        System.out.println("sorted :: "
                + stringList.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList()));

        System.out.println("\n----- ascending/descending order based on string length -------------\n");
        System.out.println("-----------ASCENDING------------");
        // ASCENDING
        System.out.println(stringList.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .limit(2)
                .skip(1)
                .findFirst()
                .get());

        System.out.println("\n-----------DESCENDING------------");
        // DESCENDING
        System.out.println(stringList.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .collect(Collectors.toList()));

        // string with second-largest in length
        System.out.println(stringList.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .limit(2)
                .skip(1)
                .findFirst()
                .get());
    }
}
