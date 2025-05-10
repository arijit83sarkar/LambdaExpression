package com.raven.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.raven.functionalprogramming.Instructor;
import com.raven.functionalprogramming.Instructors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> evenSquare = List.of(3, 6, 5, 10, 19)
                .stream()
                .filter(e -> e % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Square of even numbers :: " + evenSquare);

        System.out.println("--------------------------------------------------------------------");
        // get all instructor name
        List<String> namesList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        System.out.println(namesList);

        System.out.println("------------------------------------------------");
        Set<String> nameSet = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toSet());
        System.out.println(nameSet);
    }
}
