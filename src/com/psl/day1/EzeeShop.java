package com.psl.day1;

import java.util.Scanner;

public class EzeeShop {
	static String[] initProductNames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name: ");
		String[] prod_name = {sc.nextLine()};
		return prod_name;
	}
	
	static boolean isPresent(String[] productNames, String keyword) {
		
		return productNames[0].contains(keyword);
	}
		
}

//class App{
//	public static void main(String[] args) {
//		String [] prod_name = EzeeShop.initProductNames();
//		System.out.println("Enter keyword: ");
//		Scanner s = new Scanner(System.in);
//		String keyword = s.nextLine();
//		System.out.println(EzeeShop.isPresent(prod_name, keyword));
//	}
//}