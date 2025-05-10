package com.raven.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OddEvenNumber {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 9, 53, 69, 5, 6, 8, 7, 13, 26, 76, 48);

        // event numbers
        List<Integer> evenList = integerList.stream()
                .filter(e -> e % 2 == 0)
                .toList();
        System.out.println(evenList);

        Predicate<Integer> evenPredicate = e -> e % 2 == 0;
        evenList = integerList.stream()
                .filter(evenPredicate)
                .collect(Collectors.toList());
        System.out.println(evenList);

        // odd numbers
        List<Integer> oddList = integerList.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddList);

        Predicate<Integer> oddPredicate = e -> e % 2 != 0;
        oddList = integerList.stream()
                .filter(oddPredicate)
                .collect(Collectors.toList());
        System.out.println(oddList);

        List<String> sList = Arrays.asList("aa","bb","cc","dd","ee","aa","cc");
        List<String> sResult = sList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(sResult);

        Set<String> result = sList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}
