package com.java.sort;

public class HeapSort {

	public void heapify(int[] arr, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] > arr[largest])
			largest = l;

		if (r < n && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			heapify(arr, n, largest);
		}
	}

	public void sort(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		for (int j = n - 1; j >= 0; j--) {
			int temp = arr[0];
			arr[0] = arr[j];
			arr[j] = temp;

			heapify(arr, j, 0);
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Without Sorting");
		printArray(array);

		System.out.println();

		HeapSort hs = new HeapSort();
		hs.sort(array);
		System.out.println("After Sorting");
		printArray(array);
	}

}
