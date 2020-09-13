package com.psl.day1;

import java.util.Scanner;

public class Occurence {
	static int check(String sentence,String word) {
		int count = 0;
		
		String find[] = sentence.split(" ");
		for(int i=0; i<find.length; i++) {
			if(word.equals(find[i])) {
				count++;
			}
		}
		return count;
	}
}

//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter sentence : ");
//		String sentence = sc.nextLine();
//		
//		System.out.println("Enter word : ");
//		String word = sc.next();
//		
//		int count = Occurence.check(sentence, word);
//		System.out.println("Number of occurences : " + count);
//	}
//}