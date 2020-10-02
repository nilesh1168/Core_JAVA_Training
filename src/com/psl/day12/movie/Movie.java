package com.psl.day12.movie;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie>{
	String name;
	String language;
	LocalDate releaseDate;
	String director;
	String producer;
	int duration;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", releaseDate=" + releaseDate + ", director="
				+ director + ", producer=" + producer + ", duration=" + duration + "]";
	}


	public Movie(String name, String language, LocalDate releaseDate, String director, String producer, int duration) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}


	static public List<Movie> createMovieList() {
		List<Movie> moviesList = new ArrayList<Movie>();
		
		moviesList.add(new Movie("Jurassic Park","English",LocalDate.of(1994, Month.DECEMBER,15),"Steven Spielberg","Kathleen Kennedy",127));
		moviesList.add(new Movie("Back to the Future","English",LocalDate.of(1985, Month.JULY,3),"Robert Zemeckis","‎Bob Gale‎",116));
		moviesList.add(new Movie("The Lord of the Rings: The Fellowship of the Ring","English",LocalDate.of(2002, Month.MARCH,15),"Peter Jackson","‎Peter Jackson‎",228));
		moviesList.add(new Movie("Zapatlela","Marathi",LocalDate.of(1993, Month.APRIL,16),"Mahesh Kothare","Mahesh Kothare‎",168));
		
		return moviesList;
	}
	
	static public void sortByLanguage(List<Movie> movieList) {
		movieList.sort(new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.language.compareTo(o2.language);
			}
		});
		
		System.out.println("Sorting by Language");
		
		for (Movie string : movieList) {
			System.out.println(string);
		}
	}

	static public void sortByDuration(List<Movie> movieList) {
		movieList.sort(new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.duration - o2.duration;
			}
		});
		
		System.out.println("Sorting by Duration");
		
		for (Movie string : movieList) {
			System.out.println(string);
		}
		
	}
	
	
	static public void SortByLanguageAndReleaseDate(List<Movie> movieList) {
		movieList.sort(new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				int i = o1.language.compareTo(o2.language);
				return i==0 ? o1.releaseDate.compareTo(o2.releaseDate) : i;
			}
		});
		
		System.out.println("Sorting by Language and release date");
		
		for (Movie string : movieList) {
			System.out.println(string);
		}	
	}
	
	
	@Override
	public int compareTo(Movie o) {
		return this.name.compareTo(o.name);
	}



	
}
