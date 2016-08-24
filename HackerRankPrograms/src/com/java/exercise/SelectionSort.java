package com.java.exercise;

import java.util.Scanner;

public class SelectionSort {

	private static void seleSort(int[] ar)
	{
		int len = ar.length;
		for(int i = 0; i < len - 1; i++)
		{
			int pivot_index = i;
			for(int j = i+1; j < len; j++)
			{
				if(ar[pivot_index] > ar[j])
				{
					pivot_index = j;
				}
			}
			int temp = ar[i];
			ar[i] = ar[pivot_index];
			ar[pivot_index] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		System.out.println("Before Sorting");
		for(int t = 0; t < n; t++)
		{
			System.out.print(ar[t]+" ");
		}
		
		seleSort(ar);
		System.out.println();
		
		System.out.println("After Sorting");
		for(int x = 0; x < n; x++)
		{
			System.out.print(ar[x]+" ");
		}
		
		scan.close();
	}

}
