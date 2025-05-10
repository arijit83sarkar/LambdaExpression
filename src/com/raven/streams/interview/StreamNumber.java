package com.raven.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamNumber {
    public static void main(String[] args) {
        List<Integer> integerList =
                Arrays.asList(24, 45, 22, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);

        // LOWEST NUMBER
        System.out.println("Smallest number :: " +
                integerList.stream()
                        .sorted()
                        .distinct()
                        .limit(1)
                        .findFirst()
                        .get()
        );

        System.out.println("Second smallest number :: " +
                integerList.stream()
                        .sorted()
                        .distinct()
                        .limit(2)
                        .skip(1)
                        .findFirst()
                        .get()
        );

        // HIGHEST NUMBER
        System.out.println("Highest number :: " +
                integerList.stream()
                        .sorted(Collections.reverseOrder())
                        .distinct()
                        .limit(1)
                        .findFirst()
                        .get()
        );

        System.out.println("Second highest number :: " +
                integerList.stream()
                        .sorted(Collections.reverseOrder())
                        .distinct()
                        .limit(2)
                        .skip(1)
                        .findFirst()
                        .get()
        );
    }
}
