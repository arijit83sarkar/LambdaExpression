package com.raven.functionalprogramming;

import com.raven.streams.MovieRecord;
import com.raven.streams.MovieRecordList;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInstructorExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        System.out.println("-----------------------------------------");
        Consumer<Instructor> consumer = (instructor) -> System.out.println(instructor);
        // here there is no need to call accept() method
        // as the forEach will call the accept() method for us
        instructors.forEach(consumer);

        // print out only the instructors names
        System.out.println("-----------------------------------------");
        Consumer<Instructor> consumer2 = (instructor) -> System.out.println(instructor.getName());
        instructors.forEach(consumer2);

        // print out only the instructors names and courses
        System.out.println("-----------------------------------------");
        Consumer<Instructor> consumer3 = (instructor) -> System.out.println(instructor.getCourses());
        instructors.forEach(consumer2.andThen(consumer3));

        // print name with year of experience is > 10
        System.out.println("-----------------------------------------");
        instructors.forEach(c1 -> {
            if (c1.yearsOfExperience > 10) {
                consumer.accept(c1);
            }
        });

        // print name with year of experience is > 5 and does not teach course online
        System.out.println("-----------------------------------------");
        instructors.forEach(c1 -> {
            if (c1.yearsOfExperience > 5 && !c1.isOnlineCourses()) {
                consumer.andThen(consumer2).accept(c1);
            }
        });

        List<Country> countryList = CountryList.getCountryList();

        Consumer<Country> consumer4 = (country) -> System.out.println(country.getName());
        Consumer<Country> consumer5 = (country) -> System.out.println(country.getCtyName());

        System.out.println("-----------------------------------------------------------------");
        countryList.forEach(consumer4);
        System.out.println("-----------------------------------------------------------------");
        countryList.forEach(consumer4.andThen(consumer5));

        System.out.println("-----------------------------------------------------------------");

        List<Movie> movieList = MovieList.getMovieList();
        List<MovieRecord> movieRecords = MovieRecordList.getMovieList();

        // consumer to get all movie details
        Consumer<Movie> consumerMovie = (c) -> System.out.println(c);
        System.out.println("Movie with it details :: ");
        movieList.forEach(consumerMovie);
        System.out.println("----------------------------");

        // consumer to get all movie names
        Consumer<Movie> consumerName = (m) -> System.out.println(m.getName());
        System.out.println("Only movie names :: ");
        movieList.forEach(consumerName);
        System.out.println("----------------------------");

        // consumer to get all movie name with it actor names
        Consumer<Movie> consumerActors = (m) -> System.out.println(m.getActors());
        System.out.println("Movie names with its actors :: ");
        movieList.forEach(consumerName.andThen(consumerActors));
        System.out.println("----------------------------");

        // movie details with genre 'Drama'
        System.out.println("Movies with specific genre :: ");
        movieList.forEach(cons -> {
            if (cons.getGenre().equals("Drama")) {
                consumerMovie.accept(cons);
            }
        });
        System.out.println("----------------------------");

        // movie name and actor with genre 'Drama' and rating is greater than 6
        System.out.println("Movies with a particular genre and rating :: ");
        movieList.forEach(cons -> {
            if (cons.getGenre().equals("Drama") && cons.getRating() > 6) {
                consumerName.andThen(consumerActors).accept(cons);
            }
        });
        System.out.println("----------------------------");

    }
}
