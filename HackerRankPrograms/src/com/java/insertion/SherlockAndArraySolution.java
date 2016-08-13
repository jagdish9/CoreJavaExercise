package com.java.insertion;

import java.util.Scanner;

public class SherlockAndArraySolution {

	private static String findEqilibrium(int[] arr) {
		long sum = findArraySum(arr);

		long leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			long rightSum = 0;

			if (i != 0)
				leftSum += arr[i - 1];

			rightSum = sum - leftSum - arr[i];

			if (rightSum == leftSum)
				return "YES";
		}
		return "NO";
	}

	private static long findArraySum(int[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestcases = scanner.nextInt();

		for (int i = 0; i < numberOfTestcases; i++) {
			int n = scanner.nextInt();
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = scanner.nextInt();
			}
			System.out.println(findEqilibrium(arr));
		}
		scanner.close();
	}
}
