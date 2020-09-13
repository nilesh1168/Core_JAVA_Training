package com.psl.day1;

public class Theatre {
	static float calculateProfit( int numAttendees) {
		int total_income = numAttendees * 5;
		float profit = (float) (total_income -( 20 + (numAttendees * 0.5) )) ;
		return profit;
	}
}

//class App{
//	public static void main(String[] args) {
//		System.out.println("Profit earned is : "+Theatre.calculateProfit(20));
//	}
//}