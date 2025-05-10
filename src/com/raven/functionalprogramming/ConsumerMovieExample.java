package com.raven.functionalprogramming;

import com.raven.streams.MovieRecord;
import com.raven.streams.MovieRecordList;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMovieExample {
    public static void main(String[] args) {
        List<MovieRecord> movieRecords = MovieRecordList.getMovieList();

        // consumer to get all movie details
        Consumer<MovieRecord> consumerMovie = (c) -> System.out.println(c);
        System.out.println("Movie with it details :: ");
        movieRecords.forEach(consumerMovie);
        System.out.println("----------------------------");

        // consumer to get all movie names
        Consumer<MovieRecord> consumerName = (m) -> System.out.println(m.name());
        System.out.println("Only movie names :: ");
        movieRecords.forEach(consumerName);
        System.out.println("----------------------------");

        // consumer to get all movie name with it actor names
        Consumer<MovieRecord> consumerActors = (m) -> System.out.println(m.actors());
        System.out.println("Movie names with its actors :: ");
        movieRecords.forEach(consumerName.andThen(consumerActors));
        System.out.println("----------------------------");

        // movie details with genre 'Drama'
        System.out.println("Movies with specific genre :: ");
        movieRecords.forEach(cons -> {
            if (cons.genre().equals("Drama")) {
                consumerMovie.accept(cons);
            }
        });
        System.out.println("----------------------------");

        // movie name and actor with genre 'Drama' and rating is greater than 6
        System.out.println("Movies with a particular genre and rating :: ");
        movieRecords.forEach(cons -> {
            if (cons.genre().equals("Drama") && cons.rating() > 6) {
                consumerName.andThen(consumerActors).accept(cons);
            }
        });
        System.out.println("----------------------------");
    }
}
