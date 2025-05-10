package com.raven.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class CallableExample {
    public static int[] arrayNumber = IntStream.rangeClosed(0, 60000).toArray();
    public static int checkTotal = IntStream.rangeClosed(0, 60000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < arrayNumber.length / 2; i++) {
                sum += arrayNumber[i];
            }
            return sum;
        };

        Callable<Integer> callable2 = () -> {
            int sum = 0;
            for (int i = arrayNumber.length / 2; i < arrayNumber.length; i++) {
                sum += arrayNumber[i];
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> callables = Arrays.asList(callable1, callable2);
        List<Future<Integer>> futures = executorService.invokeAll(callables);

        int sum = 0;
        for (Future<Integer> future : futures) {
            sum += future.get();
        }
        executorService.shutdown();

        System.out.println("Sum from the Callable :: " + sum);
        System.out.println("Check sum :: " + checkTotal);
    }

}
