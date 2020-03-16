package io.javaguys.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.javaguys.model.Movie;
import io.javaguys.model.Rating;
import io.javaguys.model.UserMovies;

@RestController
@RequestMapping("/movie-catalog")
public class MovieCatalog {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@Value("movie.data.service")
	public String movieCatalogService;
	@Value("movie.info.service")
	public String movieInfologService;
	
	@RequestMapping("/{userId}")
	public List<Movie> getMovies(@PathVariable("userId") String userId) {
		UserMovies movies = restTemplate.getForObject("http://movie-info-service/movies/info/"+userId, UserMovies.class);
		List<Movie> movieList = movies.getMovies().stream().map(movie -> {
			Rating rating = restTemplate.getForObject("http://movie-data-service/movie-data/rating/"+movie.getMovieId(), Rating.class);
			movie.setRating(rating.getRating());
			return movie;
		}).collect(Collectors.toList());
		
		return movieList;
	}
}
