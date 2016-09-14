package com.java.dynamic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int f1 = 0, f2 = 1;
		int f3 = 0;
		System.out.print(f1+" "+f2+" ");
		for(int i = 2; i <= n; i++)
		{
			f3 = f1+f2;
			System.out.print(f3+" ");
			f1 = f2;
			f2 = f3;
		}
		scan.close();
	}

}
