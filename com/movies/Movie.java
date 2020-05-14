package com.movies;

public class Movie {

	private String title;
	
	public Movie(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String plot() {
		return "no plot description is set from this movie.";
	}
}
