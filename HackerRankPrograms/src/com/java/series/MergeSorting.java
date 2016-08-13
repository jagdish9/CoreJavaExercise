package com.java.series;

import java.util.Scanner;

public class MergeSorting {

	private static void mergeSort(int numbers[], int temp[], int array_size)

	{
		m_sort(numbers, temp, 0, array_size - 1);

	}

	private static void m_sort(int numbers[], int temp[], int left, int right)

	{
		int mid;

		if (right > left)

		{

			mid = (right + left) / 2;

			m_sort(numbers, temp, left, mid);

			m_sort(numbers, temp, mid + 1, right);

			merge(numbers, temp, left, mid + 1, right);

		}

		// System.out.println("Sorted array by merge sort");
		for (int j = 0; j < numbers.length; j++) {
			System.out.print(numbers[j] + " ");
		}
		System.out.println();
	}

	private static void merge(int numbers[], int temp[], int left, int mid,
			int right)

	{

		int i, left_end, num_elements, tmp_pos;

		left_end = mid - 1;

		tmp_pos = left;

		num_elements = right - left + 1;

		while ((left <= left_end) && (mid <= right))

		{

			if (numbers[left] <= numbers[mid])

			{

				temp[tmp_pos] = numbers[left];

				tmp_pos = tmp_pos + 1;

				left = left + 1;

			}

			else

			{

				temp[tmp_pos] = numbers[mid];

				tmp_pos = tmp_pos + 1;

				mid = mid + 1;

			}

		}

		while (left <= left_end)

		{

			temp[tmp_pos] = numbers[left];

			left = left + 1;

			tmp_pos = tmp_pos + 1;

		}

		while (mid <= right)

		{

			temp[tmp_pos] = numbers[mid];

			mid = mid + 1;

			tmp_pos = tmp_pos + 1;

		}

		for (i = 0; i < num_elements; i++)

		{

			numbers[right] = temp[right];

			right = right - 1;

		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scan.nextInt();
		int[] ar = new int[size];
		int[] ar1 = new int[size];
		System.out.println("Enter " + size + " integer elements");
		for (int i = 0; i < size; i++) {
			ar[i] = scan.nextInt();
		}

		mergeSort(ar, ar1, size);
		scan.close();
	}

}
