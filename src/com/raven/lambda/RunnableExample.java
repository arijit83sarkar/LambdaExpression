package com.raven.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        // Runnable - Traditional example
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Traditional sum :: " + sum);
            }
        };
        (new Thread(runnable)).start();

        // Runnable - Using Lambda expression
        Runnable runnable2 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Using Lambda expression sum :: " + sum);
        };
        (new Thread(runnable2)).start();

        // Thread using Lambda expression
        (new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Thread using Lambda expression sum :: " + sum);
        })).start();
    }
}
