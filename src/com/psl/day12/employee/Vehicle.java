package com.psl.day12.employee;

public class Vehicle {
	int number;
	String name;
	String model;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int number, String name, String model) {
		super();
		this.number = number;
		this.name = name;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", name=" + name + ", model=" + model + "]";
	}
	
	
}
