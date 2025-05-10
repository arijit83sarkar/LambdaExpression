package com.raven.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInstructorExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // map of all instructors with name and year of experience
        Function<List<Instructor>, Map<String, Integer>> f1 = (r) -> {
            Map<String, Integer> map = new HashMap<>();
            r.forEach(i -> {
                map.put(i.getName(), i.getYearsOfExperience());
            });
            return map;
        };
        System.out.println(f1.apply(instructors));

        // map of all instructors with name and year of experience teaches online
        System.out.println("-----------------------------------------");
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

        Function<List<Instructor>, Map<String, Integer>> f2 = (r) -> {
            Map<String, Integer> map = new HashMap<>();

            r.forEach(i -> {
                if (p1.test(i)) {
                    map.put(i.getName(), i.getYearsOfExperience());
                }
            });
            return map;
        };
        System.out.println(f2.apply(instructors));
    }
}
