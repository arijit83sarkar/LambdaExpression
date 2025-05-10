package com.raven.functionalprogramming;

import com.raven.streams.MovieRecord;
import com.raven.streams.MovieRecordList;

import java.util.List;
import java.util.function.Predicate;

public class PredicateInstructorExample {
    public static void main(String[] args) {
        // predicate for all instructor teaches online
        Predicate<Instructor> p1 = (p) -> p.isOnlineCourses() == true;

        // predicate for all instructors year of experience > 10
        Predicate<Instructor> p2 = (p) -> p.getYearsOfExperience() > 10;

        List<Instructor> instructors = Instructors.getAll();

        // all instructor teaches online
        instructors.forEach(i -> {
            if (p1.test(i)) {
                System.out.println(i);
            }
        });

        // all instructors year of experience > 10
        System.out.println("---------------------------------------------------------------------------");
        instructors.forEach(i -> {
            if (p2.test(i)) {
                System.out.println(i);
            }
        });

        System.out.println("-------------------------------");

        List<Movie> movieList = MovieList.getMovieList();

        Predicate<Movie> checkRating = (m) -> m.getRating() >= 7;
        Predicate<Movie> checkRevenue = (m) -> m.getRevenue() > 130;
        Predicate<Movie> checkGenre = (m) -> m.getGenre().equals("Drama");

        // movies with rating > 7 && revenue > 130
        movieList.forEach(m -> {
            if (checkRating.and(checkRevenue).test(m)) {
                System.out.println(m);
            }
        });

        System.out.println("-------------------------------");
        // movies with genre = 'Drama' && rating > 7
        movieList.forEach(m -> {
            if (checkGenre.and(checkRating).test(m)) {
                System.out.println(m);
            }
        });

        System.out.println("-------------------------------");
        // movies with genre = 'Drama' && !rating > 7
        movieList.forEach(m -> {
            if (checkGenre.and(checkRating.negate()).test(m)) {
                System.out.println(m);
            }
        });

        System.out.println("-------------------------------");
        List<MovieRecord> movieRecords = MovieRecordList.getMovieList();

        Predicate<MovieRecord> rankingPredicate = (m) -> m.rating() >= 7;
        Predicate<MovieRecord> revenuePredicate = (m) -> m.revenue() > 130;
        Predicate<MovieRecord> genrePredicate = (m) -> m.genre().equals("Drama");

        // movies with rating > 7 && revenue > 130
        movieRecords.forEach(m -> {
            if (rankingPredicate.and(revenuePredicate).test(m)) {
                System.out.println(m);
            }
        });

        System.out.println("-------------------------------");
        // movies with genre = 'Drama' && rating > 7
        movieRecords.forEach(m -> {
            if (genrePredicate.and(rankingPredicate).test(m)) {
                System.out.println(m);
            }
        });

        System.out.println("-------------------------------");
        // movies with genre = 'Drama' && !rating > 7
        movieRecords.forEach(m -> {
            if (genrePredicate.and(rankingPredicate.negate()).test(m)) {
                System.out.println(m);
            }
        });
    }
}
