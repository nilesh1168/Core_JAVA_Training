package com.psl.day1;

public class ListPrimes {
	static void printPrime(int maxVal) {
		boolean[] prime = new boolean[maxVal+1];
		
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(maxVal); i++ ) {
			if(prime[i] == true)
			{
				for(int j = i*i; j <= maxVal; j=j+i )
					prime[j] = false;
			}
		}
		
		for (int i = 2; i < prime.length; i++) {
			if(prime[i] == true)
				System.out.println(i);
		}
	}
}

//class App{
//	public static void main(String[] args) {
//		ListPrimes.printPrime(120);
//	}
//}