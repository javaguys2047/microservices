package io.javaguys.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javaguys.model.Movie;
import io.javaguys.model.UserMovies;

@RestController
@RequestMapping("/movies")
public class MovieInfoServices {
	
	@RequestMapping("/info/{userId}")
	public UserMovies getMovies(@PathVariable("userId") String userId) {
		List<Movie> movies = Arrays.asList(
				new Movie("123456", userId, "Don", 4),
				new Movie("456789", userId, "Avengers end game", 3)
		);
		
		UserMovies userMovies = new UserMovies();
		userMovies.setMovies(movies);
				
		return userMovies;
	}
}
