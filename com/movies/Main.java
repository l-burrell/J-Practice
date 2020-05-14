package com.movies;

public class Main {

	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getTitle() + " Plot: " + movie.plot());
		}
	}
	
	public static Movie randomMovie() {
		int random = (int)(Math.random() * 3) + 1;
		
		switch(random) {
		case 1:
			return new Titanic();
		case 2:
			return new Jaws();
		case 3:
			return new Forgetable();
		default:
			return null;
		}
	}
}
