package com.raven.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        IHelloWorld helloWorld = () -> {
            return "Hello World!!!";
        };
        System.out.println(helloWorld.sayHello());

        IIncrement increment = (a) -> {
            return a + 5;
        };
        System.out.println("Number increment :: " + increment.increment(10));

        IConcatenate concatenate = (a, b) -> {
            return a + " " + b;
        };
        System.out.println("String concatenation :: " + concatenate.concatenate("Hello", "World!!!"));
    }
}
