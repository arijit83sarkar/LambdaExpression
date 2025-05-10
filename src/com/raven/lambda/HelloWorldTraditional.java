package com.raven.lambda;

public class HelloWorldTraditional implements IHelloWorld, IIncrement, IConcatenate {
    @Override
    public String sayHello() {
        return "Hello World!!!";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorld = new HelloWorldTraditional();
        System.out.println(helloWorld.sayHello());
        System.out.println("Number increment :: " + helloWorld.increment(10));
        System.out.println("String concatenation :: " + helloWorld.concatenate("Hello", "World!!!"));
    }

    @Override
    public int increment(int a) {
        return a + 5;
    }

    @Override
    public String concatenate(String a, String b) {
        return a + " " + b;
    }
}
