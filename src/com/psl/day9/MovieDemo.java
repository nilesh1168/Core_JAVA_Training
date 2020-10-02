package com.psl.day9;

import java.util.List;

public class MovieDemo {
	public static void main(String[] args) {
		List<Movie> list = new Movie().readMovieData("/media/nilesh/Work/eclipse-workspace/Core_JAVA_Training/src/com/psl/day5/movies.txt");
		
		for (Movie movie : list) {
			System.out.println(movie);
		}
	}
}
