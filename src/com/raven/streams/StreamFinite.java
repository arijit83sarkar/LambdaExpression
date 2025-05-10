package com.raven.streams;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFinite {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.<Integer>builder()
                .add(1).add(2).add(9).add(16).add(25)
                .build();
        integerStream.takeWhile(s -> s > 0)
                .forEach(s -> System.out.println(s + " "));
        System.out.println("\n");

        Stream<Integer> randomInteger = Stream.generate(
                new Supplier<Integer>() {
                    @Override
                    public Integer get() {
                        Random random = new Random();
                        return random.nextInt(100);
                    }
                }
        ).limit(10);
        randomInteger.takeWhile(s -> s > 0)
                .forEach(s -> System.out.println(s + " "));
        System.out.println("\n");

        Stream<Integer> randomInteger1 = Stream.generate(
                () -> new Random().nextInt(200)
        ).limit(10);
        randomInteger1.takeWhile(s -> s > 0)
                .forEach(s -> System.out.println(s + " "));
        System.out.println("\n");

        Stream<BigDecimal> randomDecimal = Stream.generate(
                new Supplier<BigDecimal>() {
                    @Override
                    public BigDecimal get() {
                        Random random = new Random();
                        return BigDecimal.valueOf(random.nextDouble() * 100)
                                .setScale(2, RoundingMode.UP);
                    }
                }
        ).limit(10);
        randomDecimal.forEach(s -> System.out.println(s + " "));
    }
}
