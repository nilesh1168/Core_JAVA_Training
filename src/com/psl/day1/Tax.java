package com.psl.day1;

public class Tax {
	static double calTax(int gp) {
		if( gp <= 240 )
			return 0;
		else if (gp > 240 && gp < 480) {
			return gp * 0.15;
		}
		else
			return gp * 0.28;
		
	}
}

//class App{
//	public static void main(String[] args) {
//		System.out.println("The amount of Interest deposit earns per year is : "+Tax.calTax(350));
//	}
//}