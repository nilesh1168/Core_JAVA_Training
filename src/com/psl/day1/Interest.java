package com.psl.day1;

import java.util.Scanner;

public class Interest {
	static double calInterest(int amt) 
	{
		if(amt < 1000) {
			return amt * 0.04;
		}
		else if (amt < 5000) {
			return amt * 0.045;
		}
		else
			return amt * 0.05;
	}
}

//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter deposit amount : ");
//		int deposit = sc.nextInt();
//		System.out.println("The amount of Interest deposit earns per year is : "+Interest.calInterest(deposit));
//	}
//}