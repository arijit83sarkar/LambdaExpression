package com.raven.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorsExample {
    public static void main(String[] args) {

        // Define an array of integers
        List<Integer> numbers = List.of(12, 19, 28, 48, 51, 95, 37, 29, 60);

        // Define the function to check for a prime number
//        Function<Integer, Integer> isPrimeFunction = getIsPrime();

        // Use streams to filter the array and collect prime numbers
//        List<Integer> primeNumbers = numbers
//                .stream()
//                .filter(num -> isPrimeFunction.apply(num) == 1) // Keep only prime numbers
//                .collect(Collectors.toList());
        List<Integer> primeNumbers = numbers
                .stream()
                .filter(num -> isPrime(num) == 1) // Keep only prime numbers
                .collect(Collectors.toList());
        System.out.println("Prime numbers - " + primeNumbers);

        ////
        List<Student> studentList = List.of(
                new Student()
                        .setName("William Smith")
                        .setTotalMarks(467),
                new Student()
                        .setName("John Snow")
                        .setTotalMarks(487),
                new Student()
                        .setName("Smith Roe")
                        .setTotalMarks(481),
                new Student()
                        .setName("Robin Dow")
                        .setTotalMarks(451),
                new Student()
                        .setName("Sam Gigs")
                        .setTotalMarks(471)
        );

        Comparator<Student> studentComparator = Comparator.comparingInt(Student::getTotalMarks);

        // REDUCING
        // max marks
        Optional<Student> maxMarks = studentList
                .stream()
//                .collect(Collectors.maxBy(studentComparator));
                .max(studentComparator);
        if (maxMarks.isPresent()) {
            System.out.println("Student name with highest marks is "
                    + maxMarks.get().getName()
                    + " and has got  " + maxMarks.get().getTotalMarks());
            System.out.println(maxMarks.get());
        }

        // min marks
        Optional<Student> minMarks = studentList
                .stream()
//                .collect(Collectors.minBy(studentComparator));
                .min(studentComparator);
        if (minMarks.isPresent()) {
            System.out.println("Student name with minimum marks is "
                    + minMarks.get().getName()
                    + " and has got  " + minMarks.get().getTotalMarks());
            System.out.println(minMarks.get());
        }


        // SUMMARIZING
        int total = studentList
                .stream()
//                .collect(Collectors.summingInt(Student::getTotalMarks));
                .mapToInt(Student::getTotalMarks)
                .sum();
        System.out.println("Total marks - " + total);

        IntSummaryStatistics summaryStatistics = studentList
                .stream()
                .collect(Collectors.summarizingInt(Student::getTotalMarks));
        System.out.println("Statistics summary : " + summaryStatistics);

        // String joining
        String names = studentList
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println("All names : " + names);
    }

    private static Integer isPrime(Integer num) {
        Function<Integer, Integer> isPrime = (x) -> {
            if (x < 2) return 0;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) return 0;
            }
            return 1;
        };
        return isPrime.apply(num);
    }

//    private static Function<Integer, Integer> getIsPrime() {
//        Function<Integer, Integer> isPrime = (x) -> {
//            // Not prime
//            if (x < 2) return 0;
//            for (int i = 2; i <= Math.sqrt(x); i++) {
//                // Not prime
//                if (x % i == 0) return 0;
//            }
//            // Prime
//            return 1;
//        };
//        return isPrime;
//    }
}

class Student {
    private String name;
    private Integer totalMarks;
//    private List<Subject> subjects;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

//    public List<Subject> getSubjects() {
//        return subjects;
//    }
//
//    public Student setSubjects(List<Subject> subjects) {
//        this.subjects = subjects;
//        return this;
//    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public Student setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                '}';
    }
}

class Subject {
    private String name;
    private Integer marks;

    public String getName() {
        return name;
    }

    public Subject setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getMarks() {
        return marks;
    }

    public Subject setMarks(Integer marks) {
        this.marks = marks;
        return this;
    }
}
