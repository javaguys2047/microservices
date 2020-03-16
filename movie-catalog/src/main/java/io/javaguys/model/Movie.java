package io.javaguys.model;

public class Movie {
	private String movieId;
	private String userId;
	private String movieName;
	private Integer rating;
	
	public Movie() {
		
	}
	
	public Movie(String movieId, String userId, String movieName, Integer rating) {
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.movieName = movieName;
		this.rating = rating;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
