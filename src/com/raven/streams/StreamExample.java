package com.raven.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.raven.functionalprogramming.Instructor;
import com.raven.functionalprogramming.Instructors;

public class StreamExample {
        public static void main(String[] args) {
                List<Instructor> instructors = Instructors.getAll();

                // Predicate - is instructor teaches online courses
                Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();

                // Predicate - is year of experience greater than 10
                Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

                // get instructors
                List<Instructor> names = instructors.stream()
                                .filter(p1)
                                .filter(p2)
                                .collect(Collectors.toList());
                System.out.println(names);

                // get instructor name and courses
                System.out.println("--------------------------------------------------------------------");
                Map<String, List<String>> nameCourse = instructors.stream()
                                .filter(p1)
                                .filter(p2)
                                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
                System.out.println(nameCourse);

                // ----------------------------------------------------------------

                List<Integer> result = new ArrayList<>();
                List<Integer> integers = Arrays.asList(23, 45, 67, 12, 56, 90, 32, 73, 68, 76, 43, 86, 62, 71, 48, 78);
                for (int value : integers) {
                        if (value > 40 && value < 70) {
                                if (value % 2 == 0) {
                                        result.add(value);
                                }
                        }
                }
                System.out.println(result);
                integers.stream()
                                .forEach(i -> System.out.println(Thread.currentThread().getName() + " :: " + i));
                System.out.println("--------------------------------------------------------------------");

                Predicate<Integer> condition1 = (p) -> p > 40 && p < 70;
                Predicate<Integer> condition2 = (p) -> p % 2 == 0;

                result = integers.stream()
                                .filter(condition1)
                                .filter(condition2)
                                .collect(Collectors.toList());
                System.out.println(result);

                System.out.println("--------------------------------------------------------------------");

                // List<Movie> movieList = MovieList.getMovieList();

                // Consumer<Movie> consumerMovie = (c) -> System.out.println(c);
                // movieList.stream().forEach(consumerMovie);
        }
}
