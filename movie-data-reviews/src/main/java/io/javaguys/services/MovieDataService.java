package io.javaguys.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javaguys.model.Rating;

@RestController
@RequestMapping("/movie-data")
public class MovieDataService {
	
	@RequestMapping("/rating/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		Rating rating = new Rating("12345", 5);
		
		return rating;
	}
}
