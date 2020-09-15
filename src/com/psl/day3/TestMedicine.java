package com.psl.day3;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {

		Medicine medicine [] = new Medicine[10];

		Random r = new Random();
		
		switch (r.nextInt(3)+1) {
		case 1:
			Tablet tablet = new Tablet();
			tablet.displayLabel(); 
			break;
		case 2:
			Syrup syrup = new Syrup();
			syrup.displayLabel();
			break;
			
		case 3:
			Ointment ointment = new Ointment(250);
			ointment.displayLabel();
			break;
		default:
			break;
		}
		// Polymorphic behavior
		medicine[0] = new Tablet(15);
		medicine[0].displayLabel();
	}

}
