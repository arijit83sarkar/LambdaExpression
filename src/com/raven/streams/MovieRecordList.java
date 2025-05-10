package com.raven.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieRecordList {
    public static List<MovieRecord> getMovieList() {
        List<MovieRecord> movieRecords = new ArrayList<>();

        movieRecords.add(new MovieRecord("Guardians of the Galaxy", "Sci-Fi", "2014",
                121, 8.1, 757074, 333.13,
                Arrays.asList("Chris Pratt", "Vin Diesel", "Bradley Cooper", "Zoe Saldana")));
        movieRecords.add(new MovieRecord("Split", "Horror", "2016",
                117, 7.3, 157606, 138.12,
                Arrays.asList("James McAvoy", "Anya Taylor-Joy", "Haley Lu Richardson", "Jessica Sula")));
        movieRecords.add(new MovieRecord("Passengers", "Adventure", "2016",
                116, 7, 192177, 100.01,
                Arrays.asList("Jennifer Lawrence", "Chris Pratt", "Michael Sheen", "Laurence Fishburne")));
        movieRecords.add(new MovieRecord("Frozen", "Animation", "2013",
                102, 7.5, 451894, 400.74,
                Arrays.asList("Kristen Bell", "Idina Menzel", "Jonathan Groff", "Josh Gad")));
        movieRecords.add(new MovieRecord("12 Years a Slave", "Drama", "2013",
                134, 8.1, 486338, 56.67,
                Arrays.asList("Chiwetel Ejiofor", "Michael Kenneth Williams", "Michael Fassbender", "Brad Pitt")));

        return movieRecords;
    }
}
