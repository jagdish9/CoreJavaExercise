package com.java.insertion;

import java.util.Scanner;

public class UpToPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter upto prime number you want");
		int upto = scan.nextInt();
		int c = 0;
		for (int i = 2; i < upto; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j != 0 || i % j != 1) {
					c = c + 1;
				}

			}

			if (c > 0) {
				System.out.print(i + " ");
			}
			c = 0;
		}
	}

}
