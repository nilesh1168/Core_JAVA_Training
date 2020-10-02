package com.psl.day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ListModel;

enum Language{
	HINDI,ENGLISH,MARATHI;
}

public class Movie {
	int id;
	String name;
	Language lang;
	Date date;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Movie(int id, String name, Language lang, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.lang = lang;
		this.date = date;
	}


	public List<Movie> readMovieData(String filename){
		List<Movie> moviesList  = new ArrayList<Movie>(); 
		String data = null;
		try(BufferedReader in = new BufferedReader(new FileReader(filename))) {
			while ((data = in.readLine()) != null ){
				String token [] = data.split(",");
				if(token.length > 4 )
					throw new Exception("Exceeded number of values!");
				System.out.println("Movie Id: "+Integer.parseInt(token[0]));
				Language language = Language.valueOf(token[2].toUpperCase());
				System.out.println("Language "+language);
				moviesList.add(new Movie(Integer.parseInt(token[0]), token[1], Language.valueOf(token[2].toUpperCase()), new SimpleDateFormat("dd/MM/yy").parse(token[3])));
				
			}
		} catch (NumberFormatException e) {
			System.out.println("Id should be an Integer");
		} catch (IOException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println("Language Category not defined!!");
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		return moviesList;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", lang=" + lang + ", date=" + date + "]";
	}
	
	
}
