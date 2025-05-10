package com.raven.streams;

import java.util.Arrays;
import java.util.Optional;

public class StreamFindAnyDemo {
    public static void main(String[] args) {
        System.out.println("\n--------- findAny() --------------");
        Optional<Integer> anyNumber = Arrays.asList(8, 57, 19, 14, 51, 33, 38)
                .stream()
                .filter(x -> x % 2 != 0)
                .findAny();
        anyNumber.ifPresent(n -> System.out.println(n));

        Optional<Product> productAny = ProductList.getProductList()
                .stream()
                .findAny();
        productAny.ifPresent(c -> System.out.println(c));

        Optional<Product> productFilterAny = ProductList.getProductList()
                .stream()
                .filter(e -> e.getPrice() > 890)
                .findAny();
        productFilterAny.ifPresent(c -> System.out.println(c));
    }
}
