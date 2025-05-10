package com.raven.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (x) -> x > 20;
        System.out.println(p1.test(100));

        // i>20 && number is even
        Predicate<Integer> p2 = (x) -> x % 2 == 0;
        System.out.println(p1.and(p2).test(30));

        // i>20 || number is even
        System.out.println(p1.or(p2).test(21));

        // i>20 && number is odd, i%2!=0
        System.out.println(p1.and(p2.negate()).test(10));

        // i>20 || number is odd, i%2!=0
        System.out.println(p1.or(p2.negate()).test(10));
    }
}
