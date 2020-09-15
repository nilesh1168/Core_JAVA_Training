package com.psl.day3;

public class Medicine {
	
	private String nameOfCompany;
	private String addressOfCompany;
	
	
	public Medicine() {
		this.nameOfCompany = "Cipla";
		this.addressOfCompany = "Mumbai, India";
	}
	
	
	protected void displayLabel() {
		System.out.println("Name : "+this.nameOfCompany+"\nAddress: "+addressOfCompany);
	}
}

class Tablet extends Medicine{
	static private int numberOfTablets;
	
	public Tablet() {
		Tablet.numberOfTablets = 5; 
	}
	
	public Tablet(int numberOfTablets) {
		Tablet.numberOfTablets = numberOfTablets;
	}
	
	@Override
	protected void displayLabel() {
		super.displayLabel();
		System.out.println("----------Tablet Info----------");
		System.out.println("Number of Tablets : "+Tablet.numberOfTablets);
		System.out.println("Instructions:\n 1. Store in a cool dry place.\n 2.Take with food \n");
	}
}

class Syrup extends Medicine{
	private static int syrupVolume;
	
	public Syrup() {
			Syrup.syrupVolume = 120;
	}
	
	public Syrup(int syrupVol) {
		Syrup.syrupVolume = syrupVol;
	}
	
	@Override
	protected void displayLabel() {
		super.displayLabel();
		System.out.println("----------Syrup Info----------");
		System.out.println("Volume of Syrup : "+Syrup.syrupVolume+" ml");
		System.out.println("Instructions:\n 1. Store in a cool dry place.\n 2. Intake of 5-10ml prescribed. \n");
		
	}
}

class Ointment extends Medicine{
	private static int ointmentVolume;
	
	public Ointment() {
		Ointment.ointmentVolume = 150;
	}
	
	public Ointment(int ointVol) {
		Ointment.ointmentVolume = ointVol;
	}
	
	@Override
	protected void displayLabel() {
		super.displayLabel();
		System.out.println("----------Ointment Info----------");
		System.out.println("Volume of Ointment : "+Ointment.ointmentVolume+" ml");
		System.out.println("Instructions:\n 1. For external use only.\n 2. Store away from direct sunlight. \n");
	}
}