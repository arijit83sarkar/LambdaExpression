package com.raven.streams;

import java.util.List;

public record MovieRecord(
        String name,
        String genre,
        String year,
        int lengthMinutes,
        double rating,
        int votes,
        double revenue,
        List<String> actors
) {
}
