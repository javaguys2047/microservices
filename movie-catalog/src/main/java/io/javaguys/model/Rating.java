package io.javaguys.model;

public class Rating {
	private String userId;
	private Integer rating;
	
	public Rating() {
		
	}
	
	public Rating(String userId, Integer rating) {
		super();
		this.userId = userId;
		this.rating = rating;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
