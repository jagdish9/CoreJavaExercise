package com.java.dynamic;

import java.util.Scanner;

public class SamuAndShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0; i < T; i++)
		{
			int N = scan.nextInt();	
			int[] ar = new int[N];
			for(int j = 0; j < N; j++)
			{
				ar[j] = scan.nextInt();
			}
		}
		scan.close();
	}

}
