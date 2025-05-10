package com.raven.streams;

import java.util.ArrayList;
import java.util.List;

public class ProductListV2 {
    public static List<ProductV2> getProductList() {
        List<ProductV2> products = new ArrayList<>();

        // 1
        products.add(new ProductV2("iPhone 9", "An apple mobile", 549, 12.96,
                4.69, 94, "Apple", "smartphones",
                List.of("USA", "Japan", "United Kingdom", "France", "Italy", "Canada", "Germany", "Sweden", "New Zealand")));

        // 2
        products.add(new ProductV2("iPhone X", "An apple mobile", 899, 17.94, 4.44, 34, "Apple", "smartphones",
                List.of("USA", "Netherlands", "Brazil", "United Kingdom", "France", "South Korea", "Australia", "Hong Kong")));

        // 3
        ProductV2 product = new ProductV2("Samsung Universe 9", "Samsung's new variant", 1249, 15.46, 4.09, 36, "Samsung",
                "smartphones",
                List.of("USA", "Japan", "Indonesia", "Brazil", "Italy", "Canada", "Saudi Arabia", "Malaysia"));
        products.add(product);

        // 6
        product = new ProductV2("MacBook Pro", "MacBook Pro 2021 with mini-LED display", 1749, 11.02, 4.57, 83, "Samsung",
                "laptops",
                List.of("USA", "Japan", "Hong Kong", "Netherlands", "United Kingdom", "France", "Taiwan", "Canada", "New Zealand"));
        products.add(product);

        // 11
        product = new ProductV2("perfume Oil", "Mega Discount", 13, 8.4, 4.26, 65, "Impression of Acqua Di Gio",
                "fragrances",
                List.of("USA", "Thailand", "England", "France", "Italy", "Canada", "Malaysia"));
        products.add(product);

        // 54
        product = new ProductV2("Pubg Printed Graphic T-Shirt", "Vibrant & colorful printing on front", 46, 16.44, 4.62,
                136, "The Warehouse", "mens-shirts",
                List.of("USA", "Japan", "Switzerland", "Netherlands", "France", "Italy", "Canada"));
        products.add(product);

        // 56
        product = new ProductV2("Sneakers Joggers Shoes",
                "Gender: Men , Colors: Same as DisplayedCondition: 100% Brand New", 40, 12.57, 4.38, 6, "Sneakers",
                "mens-shoes",
                List.of("Singapore", "Japan", "Thailand", "France", "Poland", "Canada", "Belgium", "Malaysia"));
        products.add(product);

        // 61
        product = new ProductV2("Leather Straps Wristwatch", "Style:Sport ,Clasp:Buckles", 120, 7.14, 4.63, 91,
                "Naviforce", "mens-watches",
                List.of("USA", "Japan", "Hong Kong", "England", "France", "Italy", "Canada", "Belgium", "Sweden"));
        products.add(product);

        // 67
        product = new ProductV2("Fashion Magnetic Wrist Watch", "The product is originally manufactured by the company",
                60, 16.69, 4.03, 46, "Eastern Watches", "womens-watches",
                List.of("Netherlands", "Japan", "Thailand", "England", "France", "Italy", "Canada", "Sweden"));
        products.add(product);

        // 84
        product = new ProductV2("Square Sunglasses", "Fashion Oversized Square Sunglasses", 28, 13.89, 4.64, 64,
                "mastar watch", "sunglasses",
                List.of("USA", "Singapore", "England", "France", "Italy", "Canada", "Malaysia"));
        products.add(product);

        // 86
        product = new ProductV2("Bluetooth Aux", "Bluetooth Aux Bluetooth Car Aux", 25, 10.56, 4.57, 22, "Car Aux",
                "automotive",
                List.of("Netherlands", "Japan", "England", "France", "Thailand", "Italy", "Singapore", "Sweden"));
        products.add(product);

        // 88
        product = new ProductV2("TC Reusable Silicone Magic Washing Gloves", "TC Reusable Silicone Magic Washing Gloves",
                29, 3.19, 4.98, 42, "TC Reusable", "automotive",
                List.of("USA", "Japan", "England", "Thailand", "France", "Italy", "Canada", "Singapore"));
        products.add(product);

        // 83
        product = new ProductV2("Wiley X Night Vision Yellow Glasses", "Wiley X Night Vision Yellow Glasses for Riders",
                30, 6.33, 4.97, 115, "mastar watch", "sunglasses", List.of("New Zealand", "Hong Kong", "Netherlands",
                "Singapore", "France", "Italy", "Canada", "Sweden", "Malaysia"));
        products.add(product);

        // 94
        product = new ProductV2("Fashion motocross goggles", "new arrivals Fashion motocross goggles", 900, 3.85, 4.06,
                109, "JIEPOLLY", "motorcycle", List.of("USA", "Japan", "England", "France", "Italy", "Canada"));
        products.add(product);

        // 99
        product = new ProductV2("American Vintage Wood Pendant Light", "American Vintage Wood Pendant Light Farmhouse",
                46, 8.84, 4.32, 138, "Ifei Home", "lighting",
                List.of("USA", "Japan", "Thailand", "England", "Netherlands", "Italy", "Poland", "Canada"));
        products.add(product);

        // 79
        product = new ProductV2("Elegant Female Pearl Earrings", "Zircon Pearl Earings Women Party Accessories", 46, 8.84,
                4.74, 16, "Fashion Jewellery", "womens-jewellery",
                List.of("USA", "New Zealand", "England", "France", "Italy", "Canada", "Sweden"));
        products.add(product);

        // 75
        product = new ProductV2("Seven Pocket Women Bag", "Lady Shoulder Crossbody Bag Female Purse Seven Pocket Bag", 68,
                14.87, 4.93, 13, "Steal Frame", "womens-bags", List.of("South Korea", "USA", "Netherlands", "England",
                "France", "Singapore", "Canada", "Poland", "Malaysia"));
        products.add(product);

        // 73
        product = new ProductV2("Fancy hand clutch", "This Bag is made of synthetic leather", 44, 10.39, 4.18, 101,
                "Bracelet", "womens-bags", List.of("Hong Kong", "Japan", "England", "France", "Italy", "Canada"));
        products.add(product);

        // 64
        product = new ProductV2("Leather Strap Skeleton Watch", "Leather Strap Skeleton Watch for Men", 46, 10.2, 4.98,
                61, "Strap Skeleton", "mens-watches",
                List.of("South Korea", "Japan", "Netherlands", "France", "Italy", "Canada", "Sweden", "Malaysia"));
        products.add(product);

        // 63
        product = new ProductV2("Royal Blue Premium Watch", "Men Silver Chain Royal Blue Premium", 50, 2.56, 4.89, 142,
                "SKMEI 9117", "mens-watches", List.of("Poland", "Japan", "Singapore", "France", "Italy", "Hong Kong"));
        products.add(product);

        // 63
        product = new ProductV2("Royal Blue Premium Watch", "Men Silver Chain Royal Blue Premium", 50, 2.56, 4.89, 142,
                "SKMEI 9117", "mens-watches",
                List.of("Thailand", "Japan", "England", "Netherlands", "Italy", "Canada", "New Zealand"));
        products.add(product);

        // 9
        product = new ProductV2("Infinix INBOOK", "Infinix Inbook X1 Ci3 10th 8GB 256GB 14 Win10 Grey – 1 Year Warranty",
                1099, 11.83, 4.54, 96, "Infinix", "laptops", List.of("Thailand", "South Korea", "Japan", "England",
                "France", "Italy", "Singapore", "Sweden", "Malaysia"));
        products.add(product);

        // 10
        product = new ProductV2("HP Pavilion 15-DK1056WM", "HP Pavilion 15-DK1056WM Gaming Laptop", 1190, 6.18, 4.43, 89,
                "HP Pavilion", "laptops",
                List.of("USA", "South Korea", "England", "France", "Italy", "Canada", "Sweden", "New Zealand"));
        products.add(product);

        // 7
        product = new ProductV2("Samsung Galaxy Book", "Samsung Galaxy Book S (2020) Laptop", 1499, 4.15, 4.25, 50,
                "Samsung", "laptops", List.of("Netherlands", "Japan", "England", "Singapore", "Italy", "Canada"));
        products.add(product);

        // 8
        product = new ProductV2("Microsoft Surface Laptop 4", "Capture ideas on the vibrant touchscreen.", 1399, 10.23,
                4.43, 68, "Microsoft Surface", "laptops", List.of("Singapore", "Hong Kong", "England", "France",
                "South Korea", "Canada", "Sweden", "New Zealand", "Malaysia"));
        products.add(product);

        return products;
    }
}
