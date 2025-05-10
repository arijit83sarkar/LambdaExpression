package com.raven.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
//        List<Instructor> instructors = Instructors.getAll().stream()
//                .filter((i) -> i.getYearsOfExperience() > 8)
//                .sorted(Comparator.comparing(Instructor::getName))
//                .collect(Collectors.toList());
//        instructors.forEach(System.out::println);

        System.out.println("-------------------");
        List<Product> products = ProductList.getProductList()
                .stream()
                .filter(e -> e.getRating() > 4.5
                        && e.getDiscountPercentage() > 10)
                .collect(Collectors.toList());
        System.out.println("Products :: " + products);

        System.out.println("\n--------- Combining filter() with map() --------------");
        List<String> productTitles = ProductList.getProductList()
                .stream()
                .filter(e -> e.getRating() > 4.5
                        && e.getDiscountPercentage() > 10)
//                .map(e -> e.getTitle())
                .map(Product::getTitle)
                .collect(Collectors.toList());
        System.out.println("Product titles :: " + productTitles);

        System.out.println("\n---------- Collect filter() stream in Map object --------------");
        Map<String, List<Product>> objectListMap = ProductList.getProductList()
                .stream()
                .filter(e -> e.getRating() < 4.5)
                .collect(Collectors.groupingBy(Product::getBrand));
        for (Map.Entry<String, List<Product>> entry : objectListMap.entrySet()) {
            String key = entry.getKey();
            List<Product> values = entry.getValue();
            System.out.println(key + " :: " + values + "\n");
        }
    }
}
