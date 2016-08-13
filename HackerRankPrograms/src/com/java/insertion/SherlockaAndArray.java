package com.java.insertion;

import java.util.Scanner;

public class SherlockaAndArray {

	private static String findYesOrNo(int[] arr) {
		long total = findTotalOfArray(arr);

		long leftSum = 0;
		long rightSum = 0;
		for (int t = 0; t < arr.length; t++) {
			rightSum = 0;

			if (t != 0) {
				leftSum = leftSum + arr[t - 1];
			}

			rightSum = total - leftSum - arr[t];

			if (leftSum == rightSum) {
				return "YES";
			}
		}
		return "NO";
	}

	private static long findTotalOfArray(int[] arr) {
		int sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum = sum + arr[k];
		}
		return sum;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int notestcases = scan.nextInt();

		for (int i = 0; i < notestcases; i++) {
			int nos = scan.nextInt();
			int[] arr = new int[nos];
			for (int j = 0; j < nos; j++) {
				arr[j] = scan.nextInt();
			}
			System.out.println(findYesOrNo(arr));
		}
	}
}
