package com.psl.day12.employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Set;



public class Employee implements Comparable<Employee>{
	int empId;
	String name;
	LocalDate joinDate;
	List<Vehicle> vehicleList;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, LocalDate joinDate) {
		super();
		this.empId = empId;
		this.name = name;
		this.joinDate = joinDate;
	}

	public static void displayEmps(Set<Employee> set) {
		set.stream().forEach((s)->System.out.println(s));
	}
	
	
	public static void displayEmpsBeforeDate(Set<Employee> set, LocalDate date) {
		set.stream().filter((s)-> s.joinDate.isBefore(date)).forEach((s)->System.out.println(s));
	}
	
	public static void displayEmpsOf6Months(Set<Employee> set) {
				set.stream().filter((s)-> 
					s.joinDate.plusMonths(6).compareTo(LocalDate.now()) < 0 
			).forEach((s)->System.out.println(s));
	}
	
	public static void displayByDate(Set<Employee> set) {
		set.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o2.joinDate.compareTo(o1.joinDate);
			}	
		}).forEach((s)->System.out.println(s));
	}
	
	
	
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", joinDate=" + joinDate + "]";
	}



	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;  
		
	}
	
	
}
