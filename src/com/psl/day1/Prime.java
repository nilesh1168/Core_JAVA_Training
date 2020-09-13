package com.psl.day1;

public class Prime {
	static boolean isPrimeNumber( int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}
}

//class App{
//	public static void main(String[] args) {
//		System.out.println(" Number is Prime : "+Prime.isPrimeNumber(4));
//	}
//}