package com.example.movie_watchlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return List.of(
                new Movie(1L, "Inception", "Christopher Nolan", 2010, "Sci-Fi", 9, true, "Mindbending!"),
                new Movie(2L, "Interstellar", "Christopher Nolan", 2014, "Sci-Fi", 10, true, "Absolute masterpiece"),
                new Movie(3L, "The Dark Knight 2", "Christopher Nolan", 2008, "Action", 10, true, "Best superhero movie ever")
        );
    }
}
