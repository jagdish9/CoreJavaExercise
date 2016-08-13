package com.java.insertion;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter to check no. is prime or not");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		int count = 0;
		for (int i = 2; i < no; i++) {
			if (no % 2 == 0) {
				count = count + 1;
			}
		}

		if (count == 0) {
			System.out.println("No. is a prime no.");
		} else {
			System.out.println("No. is not a prime no.");
		}
	}
}
