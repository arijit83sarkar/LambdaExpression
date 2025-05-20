package com.raven.streams.interview;

import java.util.Collection;
import java.util.Comparator;
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

        System.out.println();

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

        System.out.println();

        // Create a Stream pipeline from a list of strings to find the first string that
        // begins with a specific character.
        List<String> strings = List.of("Bear", "Bee", "Cat", "Horse", "Dear", "Fox", "Donkey", "Elephant", "Duck",
                "Parrot");
        List<String> _result = strings.stream()
                .filter(s -> s.startsWith("D"))
                .toList();
        // System.out.println(_result);

        System.out.println();

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

        System.out.println();

        // Create a Stream pipeline using a list of Employee objects (with name and age fields)
        // to filter those older than 30, sort them by name, and collect their names into a list.
        List<Employee> employeeList = List.of(
                new Employee("Kai Le", 45),
                new Employee("Robert Patel", 30),
                new Employee("Cameron Lo", 29),
                new Employee("Harper Castillo", 28),
                new Employee("Harper Dominguez", 36),
                new Employee("Miles Chang", 39));
        List<String> nameList = employeeList.stream()
                .filter(e -> e.age() > 30)
                .sorted(Comparator.comparing(Employee::age))
                .map(Employee::name)
                .toList();
        System.out.println("Names -> ");
        nameList.forEach(System.out::println);

        System.out.println();

        // Convert a list of lists of integers (List<List<Integer>>) to a single list of integers using streams.
        List<List<Integer>> listList = List.of(
                List.of(4, 8, 9, 21),
                List.of(6, 10, 8, 2),
                List.of(11, 9, 6, 7)
        );
        List<Integer> integerListFlat = listList.stream()
                .flatMap(Collection::stream)
                .toList();
        integerListFlat.forEach(System.out::println);

        System.out.println();
    }
}

record Person(String name, String jobTitle) {
}

record Employee(String name, int age) {
}
