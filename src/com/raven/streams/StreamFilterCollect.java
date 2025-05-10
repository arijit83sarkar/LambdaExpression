package com.raven.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterCollect {
    public static void main(String[] args) {
        // List<Product> products = (ProductList.getProductList().stream())
        // .filter(null)
        // .collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(19, 24, 32, 47, 52, 67, 71, 85);

        // Predicate to filter out even numbers
        Predicate<Integer> predicate = (x) -> x % 2 != 0;

//        List<Integer> oddNumbers = numbers.stream()
//                .filter(predicate)
//                .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
