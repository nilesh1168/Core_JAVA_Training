package com.psl.day1;

import java.util.Scanner;

public class XO {
	static String [][] board = new String[3][3];
	static String checkWin() {
		String win_char = "";
		for (int i = 0; i < XO.board.length; i++) {
			for (int j = 0; j < XO.board.length; j++) {
				System.out.print(XO.board[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		for (int i = 0; i < board.length; i++) {
			if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]))
				win_char = board[i][0];
		}
		for (int i = 0; i < board.length; i++) {
			if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
				win_char = board[0][i];
		}
		
		if(board[0][0].contentEquals(board[1][1]) && board[1][1].equals(board[2][2]))
			win_char =  board[0][0];
		return win_char;
	}
}

//class App{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Fill characters : ");
//		for (int i = 0; i < XO.board.length; i++) {
//			for (int j = 0; j < XO.board.length; j++) {
//				XO.board[i][j] = sc.nextLine();
//			}
//		}
//		
//		System.out.println("Winner character : " + XO.checkWin());
//	}
//}