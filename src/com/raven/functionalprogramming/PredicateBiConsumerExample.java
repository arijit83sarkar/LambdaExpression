package com.raven.functionalprogramming;

import com.raven.streams.MovieRecord;
import com.raven.streams.MovieRecordList;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // predicate for all instructor teaches online
        Predicate<Instructor> p1 = (p) -> p.isOnlineCourses() == true;

        // predicate for all instructors year of experience > 10
        Predicate<Instructor> p2 = (p) -> p.getYearsOfExperience() > 10;

        BiPredicate<Boolean, Integer> biPredicate_1 = (online, experience) -> online == true && experience > 10;

        // biconsumer to prints instructor name and courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out
                .println("Name : " + name + " and courses : " + courses);

        Consumer<Instructor> c1 = (i) -> System.out.println(i);

        instructors.forEach(i -> {
            if (p1.and(p2).test(i)) {
                biConsumer1.accept(i.getName(), i.getCourses());
                c1.accept(i);
                System.out.println("--------------------------------------------------");
            }
        });

        instructors.forEach(i -> {
            if (biPredicate_1.test(i.isOnlineCourses(), i.getYearsOfExperience())) {
                biConsumer1.accept(i.getName(), i.getCourses());
                System.out.println("--------------------------------");
            }
        });

        System.out.println("-------------------------------");

        List<Movie> movieList = MovieList.getMovieList();

        // Predicate<Movie> checkRating = (m) -> m.getRating() >= 7;
        // Predicate<Movie> checkRevenue = (m) -> m.getRevenue() > 130;

        // bipredicate with rating >= 7 && revenue > 130
        BiPredicate<Double, Double> biPredicate = (rating, revenue) -> rating >= 7 && revenue > 130;

        // biconsumer to print movie name and its actors
        BiConsumer<String, List<String>> biConsumer = (name, actors) -> {
            System.out.println("Movie name : " + name);
            System.out.println("Actors : " + actors);
        };

        movieList.forEach(m -> {
            if (biPredicate.test(m.getRating(), m.getRevenue())) {
                biConsumer.accept(m.getName(), m.getActors());
                System.out.println("--------------------------------");
            }
        });

        System.out.println("-------------------------------");
        List<MovieRecord> movieRecords = MovieRecordList.getMovieList();

        // bi-predicate with rating >= 7 && revenue > 130
        BiPredicate<Double, Double> doubleBiPredicate = (rating, revenue) -> rating >= 7 && revenue > 130;

        // bi-consumer to print movie name and its actors
        BiConsumer<String, List<String>> listBiConsumer = (name, actors) -> {
            System.out.println("-> Movie name: " + name + ", starting with: " + actors);
        };

        movieRecords.forEach(m -> {
            if (doubleBiPredicate.test(m.rating(), m.revenue())) {
                listBiConsumer.accept(m.name(), m.actors());
            }
        });
    }
}
