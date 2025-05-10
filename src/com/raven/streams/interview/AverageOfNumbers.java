package com.raven.streams.interview;

import com.raven.streams.Item;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 1, -5, 6, 7, 9);

        Double average = integerList.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
        System.out.println(average);

        Item item1 = new Item(1, 35.5, 10);
        Item item2 = new Item(2, 45.5, 15);
        Item item3 = new Item(3, 55.5, 25);
        Item item4 = new Item(4, 65.5, 40);
        Item item5 = new Item(5, 75.5, 50);
        Item item6 = new Item(6, 85.5, 60);
        Item item7 = new Item(7, 95.5, 70);
        Item item8 = new Item(8, 105.5, 80);

        List<Item> items = Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8);

        average = items.stream()
                .map(Item::getPrice)
                .mapToDouble(p -> p)
                .average()
                .getAsDouble();
        System.out.println(average);

        average = items.stream()
                .map(Item::getStock)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(average);

        // average of price > 60
        Predicate<Double> doublePredicate = e -> e > 60;
        average = items.stream()
                .map(Item::getPrice)
                .filter(doublePredicate)
                .mapToDouble(e -> e)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
