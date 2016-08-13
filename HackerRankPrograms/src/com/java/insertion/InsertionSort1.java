package com.java.insertion;

import java.util.Scanner;

public class InsertionSort1 {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int asize = ar.length;
		int n = asize - 1;
		int el = ar[n];
		int k = n - 1, l = 0;
		for (int j = k; j >= 0; j--) {
			if (ar[j] > el) {
				ar[j + 1] = ar[j];
			}
			if (ar[j] < el) {
				ar[j + 1] = el;
				l = j;
				j = j - l;
			}

			printArray(ar);
			if (j == 0 && ar[j] == ar[j + 1]) {
				ar[j] = el;
				printArray(ar);
			}
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {

		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");

	}

}
