package com.raven.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // printing two numbers
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println(x + ", " + y);
        biConsumer1.accept(23, 32);

        // sum of two numbers
        BiConsumer<Integer, Integer> biConsumer2 = (x, y) -> System.out.println("Sum :: " + (x + y));
        biConsumer2.accept(23, 32);

        // concate of two Strings
        BiConsumer<String, String> biConsumer3 = (x, y) -> System.out.println("Concate :: " + (x + y));
        biConsumer3.accept("Hello ", "World!!!");
    }
}
