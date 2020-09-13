package com.psl.day1;

import java.util.Scanner;

public class Credit {
	static float calCharge(int amt) {
		float charge = 0;
		if(amt < 500) {
			charge = charge + (0.25f/100 * amt);
		}
		else {
			charge = charge + (0.25f/100 * 500);
			amt = amt - 500;
			if(amt > 0) {
				if(amt < 1000)
					charge = charge + (0.50f/100 * amt);
				else
					charge = charge + (0.50f/100 * 1000);
				amt = amt - 1000;
				if(amt > 0) {
					if(amt < 1000)
						charge = charge + (0.75f/100 * amt);
					else
						charge = charge + (0.75f/100 * 1000);
					amt = amt - 1000;
					if(amt > 0) {
						charge = charge + (1f/100 * amt);
					}
				}
			}
		}
		
		return charge;
	}
}

//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter charge amount : ");
//		int charge_amt = sc.nextInt();
//		System.out.println(Credit.calCharge(charge_amt));
//	}
//}