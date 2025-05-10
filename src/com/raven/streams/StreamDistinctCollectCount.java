package com.raven.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctCollectCount {
    public static void main(String[] args) {
        List<ProductV2> products = (ProductListV2.getProductList().stream())
                .distinct()
                .collect(Collectors.toList());
        products.forEach(product -> {
            System.out.println(product);
        });
        
    }
}
