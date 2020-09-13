package com.psl.day1;

public class Reverse {
	static String  makeReverse(String str)
	{
		System.out.println("Before Reverse : "+str);
		String [] split = str.split(" ");
		String rev ="";
		for (int i = 0; i < split.length; i++) {
			char[] ch = split[i].toCharArray();
			for (int j = ch.length-1 ; j >=0  ; j--) {
				rev = rev + ch[j];
			}
			rev = rev + " ";
		}
		return rev;
	}
}

//class App{
//	public static void main(String[] args) {
//		System.out.println("After Reverse : ");
//		System.out.println(Reverse.makeReverse("Hello Programmer"));
//	}
//}