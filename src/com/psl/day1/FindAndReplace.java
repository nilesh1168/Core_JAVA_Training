package com.psl.day1;

import java.util.Scanner;

public class FindAndReplace {
	static void findAndReplace(String sentence, String find, String replace) {
		boolean flag = false;
		
		String s[] = sentence.split(" ");
		
		for(int i=0; i<s.length; i++) {
			if(find.equals(s[i])) {
				s[i] = replace;
				flag = true;
			}
		}
		
		if(flag==false) {
			System.out.println("Word not found!!");
		}
		else {
			String result = String.join(" ", s);
			System.out.println("After replacing :\n" + result);
		}
		
	}
}

//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter sentence : ");
//		String sentence = sc.nextLine();
//		
//		System.out.println("Enter word to find: ");
//		String find = sc.next();
//		
//		System.out.println("Enter word to replace: ");
//		String replace = sc.next();
//	
//		FindAndReplace.findAndReplace(sentence, find, replace);
//		sc.close();
//	}
//}