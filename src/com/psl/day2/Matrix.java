package com.psl.day2;

public class Matrix {
	static void addMatrix(int m1[][], int m2[][]) {
		System.out.println("Matrix Addition Result : ");
		int [][] result= new int[3][3];
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			result[i][j] = m1[i][j] + m2[i][j];
			System.out.print(result[i][j]+"\t");
		}
		System.out.println("");
	}
		
	}
	static void subMatrix(int m1[][], int m2[][]) {
		System.out.println("Matrix Subtraction Result : ");
		int [][] result= new int[3][3];
		for (int i = 0; i < m1.length; i++) {
		for (int j = 0; j < m1[i].length; j++) {
			result[i][j] = m1[i][j] - m2[i][j];
			System.out.print(result[i][j]+"\t");
		}
		System.out.println("");
		}
	}
	
	static void MultiplyMatrix(int m1[][], int m2[][]) {
		System.out.println("Matrix Multiplication Result : ");
		int [][] result= new int[3][3];
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				result[i][j]=0;      
				for(int k=0;k<3;k++)      
					{      
						result[i][j]+=m1[i][k]*m2[k][j];      
					}
				System.out.print(result[i][j]+"\t");  
				} 
				System.out.println();   
			}    
	}   
	
	static void TransposeMatrix(int m[][]) {
		System.out.println("Matrix Transpose Result : ");
		int [][] result= new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				result[i][j] = m[j][i];
				System.out.print(result[i][j]+"\t");
			}
			System.out.println("");
			}
	}
}

class App{
	public static void main(String[] args) {
		int m1 [][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
								};
		int m2 [][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
									};
		
		System.out.println("Matrix One :");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println("");
			}
		System.out.println("Matrix Two :");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println("");
			}
		Matrix.addMatrix(m1, m2);
		Matrix.subMatrix(m1, m2);
		Matrix.MultiplyMatrix(m1, m2);
		Matrix.TransposeMatrix(m1);
	}
}