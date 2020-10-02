package com.psl.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

enum Language{
	HINDI,ENGLISH,MARATHI;
}


public class MoviesDemo {
public static void main(String[] args) {
	String data = null;
	try(BufferedReader in = new BufferedReader(new FileReader("/media/nilesh/Work/eclipse-workspace/Core_JAVA_Training/src/com/psl/day5/movies.txt"))) {
		while ((data = in.readLine()) != null ){
			String token [] = data.split(",");
			if(token.length > 4 )
				throw new Exception("Exceeded number of values!");
			System.out.println("Movie Id: "+Integer.parseInt(token[0]));
			Language language = Language.valueOf(token[2].toUpperCase());
			System.out.println("Language "+language);
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
}
}
