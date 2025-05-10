package com.raven.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapCollect {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------\n");

        System.out.println("--------- Number of characters in each word -------------\n");
        List<String> countries = List.of("Barbados", "Japan", "New Zealand", "Croatia", "Turkey");
        List<Integer> nameLength = countries
                .stream()
//                .map(e -> e.length())
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLength);
        System.out.println("-------------------------------------------\n");

        // square of numbers
        Function<Integer, Integer> squareFunction = (x) -> x * x;
        List<Integer> result = Arrays.asList(2, 3, 4, 5, 6, 7, 8)
                .stream()
                .map(squareFunction)
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("-------------------------------------------\n");

        // convert string to upper case
        Function<String, String> uppercaseFunction = String::toUpperCase;
        Stream.of("Seoul", "Istanbul", "Chicago", "Barcelona", "Sydney").map(uppercaseFunction)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------\n");

        // get all brand names of the Products
        List<String> brandList = ProductListV2.getProductList()
                .stream().map(ProductV2::getBrand)
                .collect(Collectors.toList());
        System.out.println(brandList);
        System.out.println("-------------------------------------------\n");

        brandList = ProductListV2.getProductList()
                .stream().map(obj -> uppercaseFunction.apply(obj.getBrand()))
                .collect(Collectors.toList());
        System.out.println(brandList);
        System.out.println("-------------------------------------------\n");

        // get all brand names of the Products
        List<String> distinctBrands = ProductListV2.getProductList()
                .stream().map(ProductV2::getBrand).distinct()
                .collect(Collectors.toList());
        System.out.println(distinctBrands);
        System.out.println("-------------------------------------------\n");

        Set<String> brandSet = ProductListV2.getProductList()
                .stream().map(ProductV2::getBrand).collect(Collectors.toSet());
        System.out.println(brandSet);
        System.out.println("-------------------------------------------\n");

        Set<ProductDetails> productSet = ProductListV2.getProductList()
                .stream().map(obj -> new ProductDetails(obj.getTitle(), obj.getDescription(), obj.getPrice()))
                .collect(Collectors.toSet());
        System.out.println(productSet);
    }
}

class ProductDetails {
    private String name;
    private String description;
    private double price;

    public ProductDetails() {
    }

    public ProductDetails(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDetails [name=" + name + ", description=" + description + ", price=" + price + "]";
    }
}
