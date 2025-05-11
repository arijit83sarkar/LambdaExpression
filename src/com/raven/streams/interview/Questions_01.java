package com.raven.streams.interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Questions_01 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(34, 89, 2, 90, 59, 10, 58, 48, 72, 51, 65);

        // Create a Stream pipeline to count the number of elements in a list that meet
        // a specific condition.

        long _count = integers.stream()
                .filter(e -> e % 2 == 0)
                .count();
        // System.out.println("Condition met count :: " + _count);

        // Create a Stream pipeline to collect the names of objects from a list using
        // the getName() method.
        List<Person> persons = List.of(
                new Person("Kai Le", "Controls Engineer"),
                new Person("Robert Patel", "Analyst"),
                new Person("Cameron Lo", "Network Administrator"));
        List<String> personNames = persons.stream()
                // .map(m -> m.name())
                .map(Person::name)
                .toList();
        // System.out.println(personNames);

        // Create a Stream pipeline from a list of strings to find the first string that
        // begins with a specific character.
        List<String> strings = List.of("Bear", "Bee", "Cat", "Horse", "Dear", "Fox", "Donkey", "Elephant", "Duck",
                "Parrot");
        List<String> _result = strings.stream()
                .filter(s -> s.startsWith("D"))
                .toList();
        // System.out.println(_result);

        // Create a Stream pipeline to group a list of objects by a specific property.
        List<Person> employees = List.of(
                new Person("Kai Le", "Controls Engineer"),
                new Person("Robert Patel", "Analyst"),
                new Person("Cameron Lo", "Network Administrator"),
                new Person("Harper Castillo", "IT Systems Architect"),
                new Person("Harper Dominguez", "Manager"),
                new Person("Miles Chang", "Analyst"));
        Map<String, List<Person>> _resultGroupBy = employees.stream()
                .collect(Collectors.groupingBy(Person::jobTitle));
        _resultGroupBy.forEach((k, v) -> {
            System.out.println("Job title: " + k + " -> " + v.stream().map(Person::name).toList());
        });
    }
}

record Person(String name, String jobTitle) {
}
