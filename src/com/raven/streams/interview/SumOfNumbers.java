package com.raven.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 1, 5, 6);

        // #1
        Integer sum = integerList.stream()
                .reduce((a, b) -> (a + b))
                .get();
        System.out.println(sum);

        // #2
        sum = integerList.stream()
                .reduce(Integer::sum)
                .get();
        System.out.println(sum);

        // #3
        Integer sum1 = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);

        Integer _max = integerList.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).get();
        System.out.println("Max :: " + _max);

        Integer _mul = integerList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Multiplication :: " + _mul);

        Function<String, String> function = n -> n.concat(n);
        List<String> strList = List.of("A", "B", "C", "D");
        // Stream.concat(strList.stream(), strList.stream())
        //         .forEach(m -> System.out.println(m.concat(m)));

        // List<String> list_1=strList.stream()
        // .forEach(m->strList.stream().forEach(n->m.concat(m)))
        // .;
        // System.out.println(list_1);

        strList.stream().forEach(m -> strList.stream().forEach(n -> System.out.println(m.concat(n))));

        // #4
        // Item item1 = new Item(1, 35.5, 10);
        // Item item2 = new Item(2, 45.5, 15);
        // Item item3 = new Item(3, 55.5, 25);
        // Item item4 = new Item(4, 65.5, 40);

        // List<Item> items = Arrays.asList(item1, item2, item3, item4);

        // Optional<Integer> stockSum = items.stream()
        // .map(i -> i.getStock())
        // .reduce((a, b) -> (a + b));
        // System.out.println("Sum of stock = " + stockSum.get());

        // stockSum = items.stream()
        // .map(Item::getStock)
        // .reduce(Integer::sum);
        // System.out.println("Sum of stock = " + stockSum.get());

        // Optional<Double> priceSum = items.stream()
        // .map(Item::getPrice)
        // .reduce(Double::sum);
        // System.out.println("Sum of price = " + priceSum.get());
    }
}
