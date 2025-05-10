package com.raven.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAnyMatchExample {
    public static void main(String[] args) {
        System.out.println("\n--------- anyMatch() --------------");
        Boolean booleanOdd = Arrays.asList(8, 57, 19, 14, 51, 33, 38)
                .stream()
                .anyMatch(x -> x % 2 != 0);
        System.out.println("Is ood number present? :: " + booleanOdd);

        Boolean isAnimalPresent = List.of("Fern", "Zebra", "Peace Lily", "Snake Plant")
                .stream()
                .anyMatch(e -> e.equals("Zebra"));
        if (isAnimalPresent) {
            System.out.println("List contains animal name.");
        } else {
            System.out.println("We have a list of plant names.");
        }

        // is there any Product of price greater than 1000/-.
        Predicate<Product> predicate = (p) -> p.getPrice() > 1000;
        Boolean anyMatch = ProductList.getProductList()
                .stream()
//                .anyMatch(a -> a.getPrice() > 1000);
                .anyMatch(predicate);
        System.out.println("Product of price 1000/- is preset? " + anyMatch);

//        Optional<Product> productFilterAny = ProductList.getProductList()
//                .stream()
//                .filter(e -> e.getPrice() > 890)
//                .findAny();
//        productFilterAny.ifPresent(c -> System.out.println(c));

        System.out.println("\n--------- anyMatch() with filter() --------------");
//        Stream<String> brandNames = Arrays.stream(new String[]{"Apple", "Boat"});
        List<String> brandNames = List.of(new String[]{"Apple", "Boat"});

        List<Product> products = ProductList.getProductStream()
                .filter(e -> brandNames.stream().anyMatch(a -> a.equals(e.getBrand())))
                .collect(Collectors.toList());
        System.out.println("Products :: " + products);
    }
}
