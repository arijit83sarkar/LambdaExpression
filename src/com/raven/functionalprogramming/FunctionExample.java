package com.raven.functionalprogramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // square root
        Function<Integer, Double> f1 = (n) -> Math.sqrt(n);
        System.out.println("Sqare root of 64 is :: " + f1.apply(64));

        // lowercase
        Function<String, String> f2 = (n) -> n.toLowerCase();
        System.out.println(f2.apply("HELLO"));

        // concatenate
        Function<String, String> f3 = (n) -> n.concat(" World!!!");
        System.out.println(f2.andThen(f3).apply("HELLO"));

        // compose function
        System.out.println(f2.compose(f3).apply("HELLO"));
    }
}
