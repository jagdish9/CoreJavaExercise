package com.java.insertion;

import java.util.Scanner;

public class ParlourIcecream {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int notstcases = scan.nextInt();
		int sum = 0, round = 0;
		int i1 = 0, i2 = 0;
		for (int i = 0; i < notstcases; i++) {
			round = 0;
			int m = scan.nextInt();
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scan.nextInt();
			}

			for (int k = 0; k < n; k++) {
				for (int l = 1; l <= n - 1; l++) {
					sum = arr[k] + arr[l];
					if (sum == m) {
						if (round == 0) {
							i1 = k + 1;
							i2 = l + 1;
							round = round + 1;
							// break;
						}

					}
				}

			}

			System.out.print(i1 + " " + i2);
			System.out.println();

		}

	}
}
