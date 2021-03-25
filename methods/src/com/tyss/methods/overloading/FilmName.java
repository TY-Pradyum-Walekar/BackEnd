package com.tyss.methods.overloading;

public class FilmName {

	public void actor(String name, String director) {
		System.out.println("the movie name "+ name + " "+ director);

	}

	public void actor(int rating, String movie_name) {
		System.out.println("the rating is"+ rating + " "+movie_name);

	}

}
