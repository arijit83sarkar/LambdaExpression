package com.raven.functionalprogramming;

import com.raven.streams.MovieRecord;
import com.raven.streams.MovieRecordList;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInstructorExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // prints instructor name and gender
        BiConsumer<String, String> biConsumer1 = (name, gender) -> System.out
                .println("Name is : " + name + " and gender is : " + gender);
        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(), instructor.getGender());
        });

        // prints instructor name and courses
        System.out.println("-----------------------------------------");
        BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out
                .println("Name : " + name + " and courses : " + courses);
        instructors.forEach(instructor -> {
            biConsumer2.accept(instructor.getName(), instructor.getCourses());
        });

        // prints instructor name and courses who teaches online
        System.out.println("-----------------------------------------");
        instructors.forEach(instructor -> {
            if (instructor.isOnlineCourses()) {
                biConsumer1.accept(instructor.getName(), instructor.getGender());
            }
        });
        System.out.println("-------------------------------");

        List<Movie> movieList = MovieList.getMovieList();
        System.out.println("Movie name with year :: ");
        BiConsumer<String, String> movieBiConsumer = (name, year) -> System.out.println(name + " (" + year + ")");
        movieList.forEach(movie -> {
            movieBiConsumer.accept(movie.getName(), movie.getYear());
        });
        System.out.println("-------------------------------");

        List<MovieRecord> movieRecords = MovieRecordList.getMovieList();
        System.out.println("Movie Record with name and year :: ");
        BiConsumer<String, String> recordBiConsumer = (name, year) -> System.out.println(name + " (" + year + ")");
        movieRecords.forEach(movie -> {
            recordBiConsumer.accept(movie.name(), movie.year());
        });
        System.out.println("-------------------------------");
    }
}
