package com.raven.streams.interview;

import com.raven.streams.ItemV2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByElement {
    public static void main(String[] args) {
        List<ItemV2> itemV2List = getItemList();

        Map<Integer, Double> map1 = itemV2List.stream()
                .collect(Collectors.toMap(e -> e.getId(), e -> e.getPrice() * e.getStock()));
        System.out.println(map1);

        // group by Item Category
        Map<String, List<ItemV2>> groupByCategory = itemV2List.stream()
                .collect(Collectors.groupingBy(ItemV2::getCategory));
//        System.out.println(groupByCategory);
        System.out.println("\nGroup by Category ---->");
        groupByCategory.forEach((k, v) -> {
            System.out.println("Key :: " + k + ", value :: " + v);
        });

        // sort by price and group by category
        Map<String, List<ItemV2>> sortAndGroupBy = itemV2List.stream()
                .sorted(Comparator.comparing(e -> e.getPrice()))
                .collect(Collectors.groupingBy(e -> e.getCategory()));
        System.out.println("\nsort by price and group by category ---->");
        sortAndGroupBy.forEach((k, v) -> {
            System.out.println("Key :: " + k + ", value :: " + v);
        });

        // group by Item Category with counting
        Map<String, Long> groupByCategoryCount = itemV2List.stream()
                .collect(Collectors.groupingBy(ItemV2::getCategory, Collectors.counting()));
        System.out.println("\nGroup by Category with Count ---->");
        groupByCategoryCount.forEach((k, v) -> {
            System.out.println("Key :: " + k + ", value :: " + v);
        });

        // group by Item Category with SUM
        Map<String, Double> groupByCategorySum = itemV2List.stream()
                .collect(Collectors.groupingBy(ItemV2::getCategory, Collectors.summingDouble(e -> e.getPrice())));
        System.out.println("\nGroup by Category with Sum ---->");
        groupByCategorySum.forEach((k, v) -> {
            System.out.println("Key :: " + k + ", value :: " + v);
        });

        // PartitionBY
        // Collectors.partioningBy returns boolean as a key, where when condition met the key is true
        // and when condition not met the key is false.
        Map<Boolean, List<ItemV2>> partitionBy = itemV2List.stream()
                .collect(Collectors.partitioningBy(e -> e.getPrice() > 40));
        System.out.println("\nPartioningBy ---->");
        partitionBy.forEach((k, v) -> {
            System.out.println("Key :: " + k + ", value :: " + v);
        });
    }

//    https://javainfinite.com/java/collectors-in-java-8-with-examples/

    public static List<ItemV2> getItemList() {
        List<ItemV2> itemV2List = new ArrayList<>();

        ItemV2 itemV2 = new ItemV2(1001, "Item #1", 34.5, 10, "category1");
        itemV2List.add(itemV2);

        itemV2 = new ItemV2(1002, "Item #2", 39.5, 20, "category2");
        itemV2List.add(itemV2);

        itemV2 = new ItemV2(1003, "Item #3", 44.5, 15, "category2");
        itemV2List.add(itemV2);

        itemV2 = new ItemV2(1004, "Item #4", 54.9, 19, "category3");
        itemV2List.add(itemV2);

        itemV2 = new ItemV2(1005, "Item #5", 29.5, 12, "category1");
        itemV2List.add(itemV2);

        itemV2 = new ItemV2(1006, "Item #6", 59.5, 14, "category3");
        itemV2List.add(itemV2);

        itemV2 = new ItemV2(1007, "Item #7", 30.5, 24, "category1");
        itemV2List.add(itemV2);

        return itemV2List;
    }
}
