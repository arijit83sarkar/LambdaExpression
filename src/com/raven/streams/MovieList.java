package com.raven.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieList {
    public static List<Movie> getMovieList() {
        List<Movie> movieList = new ArrayList<>();

        Movie movie = new Movie("Guardians of the Galaxy", "Sci-Fi", "2014",
                121, 8.1, 757074, 333.13,
                Arrays.asList("Chris Pratt", "Vin Diesel", "Bradley Cooper", "Zoe Saldana")
        );
        movieList.add(movie);

        movie = new Movie("Prometheus", "Sci-Fi", "2012",
                124, 7, 485820, 126.46,
                Arrays.asList("Noomi Rapace", "Logan Marshall-Green", "Michael Fassbender", "Charlize Theron"));
        movieList.add(movie);

        movie = new Movie("Split", "Horror", "2016",
                117, 7.3, 157606, 138.12,
                Arrays.asList("James McAvoy", "Anya Taylor-Joy", "Haley Lu Richardson", "Jessica Sula"));
        movieList.add(movie);

        movie = new Movie("Passengers", "Adventure", "2016",
                116, 7, 192177, 100.01,
                Arrays.asList("Jennifer Lawrence", "Chris Pratt", "Michael Sheen", "Laurence Fishburne"));
        movieList.add(movie);

        movie = new Movie("Frozen", "Animation", "2013",
                102, 7.5, 451894, 400.74,
                Arrays.asList("Kristen Bell", "Idina Menzel", "Jonathan Groff", "Josh Gad"));
        movieList.add(movie);

        movie = new Movie("12 Years a Slave", "Drama", "2013",
                134, 8.1, 486338, 56.67,
                Arrays.asList("Chiwetel Ejiofor", "Michael Kenneth Williams", "Michael Fassbender", "Brad Pitt"));
        movieList.add(movie);

        movie = new Movie("Into the Woods", "Drama", "2014",
                125, 6, 109756, 128,
                Arrays.asList("Anna Kendrick", "Meryl Streep", "Chris Pine", "Emily Blunt"));
        movieList.add(movie);

        return movieList;
    }
}

class Movie {
    String name;
    String genre;
    String year;
    int lengthMinutes;
    double rating;
    int votes;
    double revenue;
    List<String> actors;

    public Movie(String name, String genre, String year, int lengthMinutes, double rating, int votes, double revenue,
                 List<String> actors) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.lengthMinutes = lengthMinutes;
        this.rating = rating;
        this.votes = votes;
        this.revenue = revenue;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public void setLengthMinutes(int lengthMinutes) {
        this.lengthMinutes = lengthMinutes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", genre=" + genre + ", year=" + year + ", lengthMinutes=" + lengthMinutes
                + ", rating=" + rating + ", votes=" + votes + ", revenue=" + revenue + ", actors=" + actors + "]";
    }

}
