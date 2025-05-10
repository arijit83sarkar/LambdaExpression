package com.raven.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 222, 20, 98, 230);
        List<Integer> numWith2 = integerList.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(e -> Integer.valueOf(e))
                .collect(Collectors.toList());
        System.out.println(numWith2);

        List<Integer> integerList1 = Arrays.asList(24, 45, 29, 30, 222, -20, 98, 230, 73, -23, 54, 60, 22, 92, 83);
        numWith2 = integerList1.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2") || e.startsWith("-"))
                .map(e -> Integer.valueOf(e))
                .collect(Collectors.toList());
        System.out.println(numWith2);
    }
}
