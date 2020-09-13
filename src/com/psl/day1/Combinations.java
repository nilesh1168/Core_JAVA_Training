package com.psl.day1;

import java.util.Scanner;

public class Combinations {
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	static void getCombinations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			getCombinations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}


}

//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter string : ");
//		String word = sc.nextLine();
//		Combinations.getCombinations(word.toCharArray(),0);
//		sc.close();
//	}
//}