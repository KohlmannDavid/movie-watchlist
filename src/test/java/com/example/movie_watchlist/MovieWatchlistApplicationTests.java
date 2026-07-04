package com.example.movie_watchlist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieWatchlistApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void movieEntityCreation() {
		Movie movie = new Movie(1L, "Inception", "Christopher Nolan", 2010, "Sci-Fi", 9, true, "Great movie");
		assert movie.getTitle().equals("Inception");
		assert movie.getDirector().equals("Christopher Nolan");
		assert movie.getReleaseYear() == 2010;
	}
}