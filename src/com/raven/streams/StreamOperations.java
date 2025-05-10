package com.raven.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.raven.functionalprogramming.Instructor;
import com.raven.functionalprogramming.Instructors;

public class StreamOperations {
    public static void main(String[] args) {
        // count
        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .count();
        System.out.println(count);

        // distinct count
        Long distinctCount = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(distinctCount);

        // distinct course names
        List<String> courseNamesSet = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(courseNamesSet);

        // sorted course names
        List<String> courseNamesSort = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(courseNamesSort);
    }
}
