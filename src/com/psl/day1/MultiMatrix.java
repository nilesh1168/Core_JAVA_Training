package com.psl.day1;

public class MultiMatrix {
	static void displayMultiplicationMatrix() {
		int [][] matrix = new int [13][13] ;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i==0)
					matrix[i][j]=j;
				else if(j==0)
					matrix[i][j]=i;
				else
				matrix[i][j] = i*j;
			}
		}
		for(int i=0;i< matrix.length;i++){  
			 for(int j=0;j < matrix.length;j++){  
			   System.out.print(matrix[i][j]+"\t");  
			 }  
			 System.out.println();  
			}
		
	}
}

//class App{
//	public static void main(String[] args) {
//		MultiMatrix.displayMultiplicationMatrix();
//	}
//}