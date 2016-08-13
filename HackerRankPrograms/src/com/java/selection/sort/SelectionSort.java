package com.java.selection.sort;

import java.util.Scanner;

public class SelectionSort {

	private static void SortedArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int iMin = i;
			int k = i + 1;
			for (int j = k; j < ar.length; j++) {
				if (ar[j] < ar[iMin]) {
					iMin = j;
				}
			}

			if (iMin != i) {
				int temp = ar[iMin];
				ar[iMin] = ar[i];
				ar[i] = temp;
			}
		}

		System.out.println("Sorted array by selection sort");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scan.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter " + size + " integer elements");

		for (int i = 0; i < size; i++) {
			ar[i] = scan.nextInt();
		}

		scan.close();
		SortedArray(ar);

	}

}
