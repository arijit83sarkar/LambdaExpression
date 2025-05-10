package com.raven.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProductList {
    public static List<Product> getProductList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 9", "An apple mobile", 549, 12.96, 4.69, 94, "Apple", "smartphones"));
        products.add(new Product("iPhone X", "An apple mobile", 899, 17.94, 4.44, 34, "Apple", "smartphones"));
        products.add(new Product("Samsung Universe 9", "Samsung's new variant", 1249, 15.46, 4.09, 36, "Samsung", "smartphones"));
        products.add(new Product("MacBook Pro", "MacBook Pro 2021 with mini-LED display", 1749, 11.02, 4.57, 83, "Samsung", "laptops"));
        products.add(new Product("perfume Oil", "Mega Discount", 13, 8.4, 4.26, 65, "Impression of Acqua Di Gio", "fragrances"));
        products.add(new Product("Pubg Printed Graphic T-Shirt", "Vibrant & colorful printing on front", 46, 16.44, 4.62, 136, "The Warehouse", "mens-shirts"));
        products.add(new Product("Sneakers Joggers Shoes", "Gender: Men , Colors: Same as DisplayedCondition: 100% Brand New", 40, 12.57, 4.28, 6, "Sneakers", "mens-shoes"));
        products.add(new Product("Leather Straps Wristwatch", "Style:Sport ,Clasp:Buckles", 120, 7.14, 4.13, 91, "Naviforce", "mens-watches"));
        products.add(new Product("Fashion Magnetic Wrist Watch", "The product is originally manufactured by the company", 60, 16.69, 4.03, 46, "Eastern Watches", "womens-watches"));
        products.add(new Product("Square Sunglasses", "Fashion Oversized Square Sunglasses", 28, 13.89, 3.64, 64, "RayBand", "sunglasses"));
        products.add(new Product("Bluetooth Aux", "Bluetooth Aux Bluetooth Car Aux", 25, 10.56, 4.17, 22, "Boat", "automotive"));

        Arrays.stream(products.toArray());
        return products;
    }

    public static Stream<Product> getProductStream() {
        List<Product> products = List.of(
                new Product("iPhone 9", "An apple mobile", 549, 12.96, 4.69, 94, "Apple", "smartphones"),
                new Product("iPhone X", "An apple mobile", 899, 17.94, 4.44, 34, "Apple", "smartphones"),
                new Product("Samsung Universe 9", "Samsung's new variant", 1249, 15.46, 4.09, 36, "Samsung", "smartphones"),
                new Product("MacBook Pro", "MacBook Pro 2021 with mini-LED display", 1749, 11.02, 4.57, 83, "Samsung", "laptops"),
                new Product("perfume Oil", "Mega Discount", 13, 8.4, 4.26, 65, "Impression of Acqua Di Gio", "fragrances"),
                new Product("Pubg Printed Graphic T-Shirt", "Vibrant & colorful printing on front", 46, 16.44, 4.62, 136, "The Warehouse", "mens-shirts"),
                new Product("Sneakers Joggers Shoes", "Gender: Men , Colors: Same as DisplayedCondition: 100% Brand New", 40, 12.57, 4.28, 6, "Sneakers", "mens-shoes"),
                new Product("Leather Straps Wristwatch", "Style:Sport ,Clasp:Buckles", 120, 7.14, 4.13, 91, "Naviforce", "mens-watches"),
                new Product("Fashion Magnetic Wrist Watch", "The product is originally manufactured by the company", 60, 16.69, 4.03, 46, "Eastern Watches", "womens-watches"),
                new Product("Square Sunglasses", "Fashion Oversized Square Sunglasses", 28, 13.89, 3.64, 64, "RayBand", "sunglasses"),
                new Product("Bluetooth Aux", "Bluetooth Aux Bluetooth Car Aux", 25, 10.56, 4.17, 22, "Boat", "automotive")
        );

        return products.stream();
    }
}
