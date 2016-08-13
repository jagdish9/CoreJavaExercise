package com.java.series;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f0 = 0;
		int f1 = 1;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. for which you want fibonacci series: ");
		int size = scan.nextInt();

		System.out.print(f0);
		System.out.print(" " + f1);
		for (int i = 0; i <= size; i++) {
			n = f0 + f1;
			f0 = f1;
			f1 = n;
			System.out.print(" " + n);
		}
		scan.close();
	}

}
