package com.psl.day12.movie;

import java.util.List;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> list = Movie.createMovieList();
		
		for (Movie string : list) {
			System.out.println(string);
		}
		
		System.out.println("===================");
		
		list.sort(null); 
		System.out.println("default sort");
		
		for (Movie movie : list) {
			System.out.println(movie);
		}
		
		Movie.sortByDuration(list);
		Movie.sortByLanguage(list);
		Movie.SortByLanguageAndReleaseDate(list);

	}

}
