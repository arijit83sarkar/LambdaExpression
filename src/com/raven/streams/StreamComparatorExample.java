package com.raven.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.raven.functionalprogramming.Instructor;
import com.raven.functionalprogramming.Instructors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        // sort by instructor name
        List<Instructor> instructors = Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        instructors.forEach(System.out::println);

        // sort by instructor year of experience
        System.out.println("---------------------------------------------------");
        instructors = Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getYearsOfExperience))
                .collect(Collectors.toList());
        instructors.forEach(System.out::println);
    }
}
