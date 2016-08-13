package com.java.series;

import java.util.Scanner;

public class LinearSearch {

	/**
	 * @param args
	 */

	private static void linearSearch(int[] arr, int search) {
		int c = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == search) {
				c = c + 1;
				break;
			}
		}

		if (c > 0) {
			System.out.println(search + " is available");
		} else {
			System.out.println(search + " is not available");
		}
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

		System.out.println("Enter search element which you want to search");
		int search = scan.nextInt();

		linearSearch(arr, search);
		scan.close();
	}

}
