package com.java.series;

import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 */

	private static int[] bubbleSort(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < (arr.length - 1) - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array to store the elements:");
		int size = scan.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter " + size + " integer elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		scan.close();

		System.out.println("Before Sorting");

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

		int[] abr = bubbleSort(arr);
		System.out.println();
		System.out.println("Sorted array");
		for (int k = 0; k < abr.length; k++) {
			System.out.print(abr[k] + " ");
		}
	}

}
