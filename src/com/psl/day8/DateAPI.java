package com.psl.day8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateAPI {

	public static void main(String[] args) {
		
		LocalDate birthDate = LocalDate.of(1998, Month.OCTOBER, 8);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthDate, today);
		System.out.println("Age of person born on "+birthDate+" is");
		System.out.println(p.getYears()+" years, "+p.getMonths()+" months, "+p.getDays()+" days");
	}

}
