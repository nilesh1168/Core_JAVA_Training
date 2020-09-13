package com.psl.day1;

public class Alphabet {
	static boolean checkAlpha(char alph) {
		char[] vowel = {'a','e','i','o','u'};
		for (char c : vowel) {
			if(alph == c)
				return true;
		}
		return false;
	}
}
 
//class App{
//	public static void main(String[] args) {
//		System.out.println("Alphabet is vowel : "+Alphabet.checkAlpha('i'));
//	}
//}