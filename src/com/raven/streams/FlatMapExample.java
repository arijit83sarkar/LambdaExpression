package com.raven.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.raven.functionalprogramming.Instructor;
import com.raven.functionalprogramming.Instructors;

public class FlatMapExample {
    public static void main(String[] args) {
        Set<String> courseNamesSet = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        System.out.println(courseNamesSet);
    }
}
