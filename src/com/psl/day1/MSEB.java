package com.psl.day1;

public class MSEB {
	static double calcElectricityBill(int units, String connection) {
		switch (connection) {
		case "commercial":
			if(units <= 100)
				return Math.max(units * 4.25, 350);
			else if (units > 100 && units < 300) {
				return units * 4.75;
			}
			else if (units > 300 && units < 500) {
				return units * 5;
			}
			else
				return units * 5.25;

		default:
			
			if(units <= 100)
				return Math.max(units * 4, 250);
			else if (units > 100 && units < 300) {
				return units * 4.5;
			}
			else if (units > 300 && units < 500) {
				return units * 4.75;
			}
			else
				return units * 5;
		}
		
	}
}

//class App{
//	public static void main(String[] args) {
//		System.out.println("Electricity bill for Domestic and units = 350 is: ");
//		System.out.println(MSEB.calcElectricityBill(350,"domestic"));
//	}
//}