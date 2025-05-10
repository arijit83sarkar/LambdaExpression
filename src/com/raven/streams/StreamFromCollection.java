package com.raven.streams;

import java.util.List;

public class StreamFromCollection {
    public static void main(String[] args) {
        List<Integer> geometrySeries = List.of(1, 3, 9, 27, 81, 243);
        geometrySeries.stream()
                .forEach(i -> System.out.println(Thread.currentThread().getName() + ": " + i));
    }
}
