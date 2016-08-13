package com.java.series;

import java.util.Scanner;

public class BinarySearch {

	/**
	 * @param args
	 */
	private static int[] bubbleSort(int[] arr) {
		int len = arr.length - 1;
		int temp = 0;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private static void binarySearch(int[] arr, int search) {
		int c = 0, i = 0;
		int mid = 0;
		int len = arr.length - 1;

		while (i <= len) {
			mid = (i + len) / 2;

			if (search == arr[mid]) {
				c = c + 1;
				break;
			} else if (search < arr[mid]) {
				len = mid - 1;
			} else {
				i = mid + 1;
			}

		}

		if (c > 0) {
			System.out.println("element " + search + " is available");
		} else {
			System.out.println("element " + search + " is not available");
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

		int[] abr = bubbleSort(arr);

		binarySearch(abr, search);
		scan.close();
	}

}
