package com.psl.day1;

public class MaxofThree {
	static int calMax(int x,int y,int z) {
		if(x>y)
			if(x>z)
				return x;
			else
				return z;
		else if (y > z) 
			return y;
		else 
			return z;
	}

}


//class App{
//	public static void main(String[] args) {
//		int max = MaxofThree.calMax(54,333,4444);
//		System.out.println("Max: "+max);
//	}
//}