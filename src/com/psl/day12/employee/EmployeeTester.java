package com.psl.day12.employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<Employee>();
		set.add(new Employee(1, "Nilesh",LocalDate.of(1999, Month.AUGUST, 13)));
		set.add(new Employee(2, "Suraj",LocalDate.of(2019, Month.JULY, 13)));
		set.add(new Employee(1, "Nilesh",LocalDate.of(2008, Month.FEBRUARY, 13)));
		set.add(new Employee(4, "Suresh",LocalDate.of(2020, Month.MARCH, 13)));
		set.add(new Employee(5, "Ramesh",LocalDate.now()));
		
		Employee.displayEmps(set);
		System.out.println("=====");
		Employee.displayEmpsBeforeDate(set, LocalDate.now());
		System.out.println("=====");
		Employee.displayEmpsOf6Months(set);
		System.out.println("=====");
		Employee.displayByDate(set);
	}
	
	
}
