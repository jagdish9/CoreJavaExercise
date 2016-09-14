package com.java.exercise;

import java.util.Scanner;

public class InsertionSort {

	private static void insertSort(int[] ar)
	{
		int len = ar.length;
		for(int i = 1; i < len; i++)
		{
			int key = ar[i];
			int j = i - 1;
			while(j>=0 && ar[j] > key)
			{
				ar[j+1] = ar[j];
				j = j -1;
			}
			ar[j+1] = key;
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
		
		System.out.println();
		
		insertSort(ar);
		
		System.out.println("After Sorting");
		for(int t = 0; t < n; t++)
		{
			System.out.print(ar[t]+" ");
		}
		
		scan.close();
	}

}
