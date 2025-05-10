package com.raven.streams;

import java.util.function.Consumer;

public class StreamForEach {
    public static void main(String[] args) {
        // get all product details
        (ProductListV2.getProductList().stream()).forEach(product -> {
            System.out.println(product);
        });
        System.out.println("--------------------------------------------------------------------");

        (ProductListV2.getProductList().stream()).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");

        Consumer<ProductV2> consumerProduct = (c) -> System.out.println(c + "\n");
        (ProductListV2.getProductList().stream()).forEach(consumerProduct);
        System.out.println("--------------------------------------------------------------------");

        // get all product name and price
        Consumer<ProductV2> consumerNamePrice =
            (c) -> System.out.println("Name: " + c.getTitle().toUpperCase() 
                        + "\nDescription: " + c.getDescription()
                        + "\nPrice: " + c.getPrice() + "\n");
        (ProductListV2.getProductList().stream()).forEach(consumerNamePrice);
    }
}