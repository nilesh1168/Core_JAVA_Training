package com.psl.day1;

import java.util.Scanner;

public class PrimeArray {
	static int [] findPrime(int maxVal) {
	int [] prime_array = new int[40];
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
	int k=0;
	for (int i = 2; i < prime.length; i++) {
		if(prime[i] == true) {
			prime_array[k] = i;
			k++;
		}
	}
	return prime_array;
}
}


//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter max value to find: ");
//		int max_val = sc.nextInt();
//		int [] primes = PrimeArray.findPrime(max_val);
//		for (int i : primes) {
//			if(i==0)
//				break;
//			else
//			System.out.println(i);
//		}
//	}
//}