package com.psl.day1;

import java.util.Scanner;

public class Availability {
	static int findPosition(int num,int[] nos) {
		int position[] = new int[10];
		
		int j=0;
		
		for(int i=0; i<nos.length; i++) {
			if(nos[i] == num) {
				position[j] = i+1;
				j++;
			}
		}
		
		System.out.println("The number is available at position: ");
		for(int i=0; i<j; i++) {
			System.out.println(position[i]);
		}
		
		return j;
	}
}

//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int nos[] = new int[10];
//		
//		System.out.println("Enter number of elements in the array :");
//		int n = sc.nextInt();
//		
//		System.out.println("Enter elements: ");
//		for(int i=0;i<n;i++) {
//			nos[i] = sc.nextInt();
//		}
//		
//		System.out.println("Enter number to find : ");
//		int num = sc.nextInt();
//		
//		Availability.findPosition(num, nos);
//		sc.close();
//	}
//}