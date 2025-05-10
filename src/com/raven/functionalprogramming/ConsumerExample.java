package com.raven.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (a) -> {
            System.out.println("Message from Consumer :: " + a);
        };
        consumer.accept("Hi there!!!");

        Consumer<Integer> consumer2 = (a) -> {
            System.out.println("a*a = " + a * a);
            System.out.println("a/a = " + a / a);
        };
        consumer2.accept(4);
    }
}
