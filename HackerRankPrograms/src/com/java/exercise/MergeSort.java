package com.java.exercise;

import java.util.Scanner;

public class MergeSort {

	private static void mergSort(int[] ar, int l, int m, int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0; i<n1; i++)
		{
			L[i] = ar[l+i];
		}
		
		for(int j = 0; j<n2; j++)
		{
			R[j] = ar[l+j+m];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j] )
			{
				ar[k] = L[i];
				i++;
			}
			else
			{
				ar[k] = R[j];
				j++;
			}
			
			k++;
		}
		
		while(i<n1)
		{
			ar[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			ar[k] = R[j];
			j++;
			k++;
		}
	}
	
	private static void sort(int[] ar, int l, int r)
	{
		int m = (l+r)/2;
		sort(ar, l, m);
		sort(ar, m+1, r);
		mergSort(ar, l, m, r);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++)
		{
			ar[i] = scan.nextInt();
		}

		scan.close();
		
		System.out.println("Before Sorting");
		for(int t = 0; t < n; t++)
		{
			System.out.print(ar[t]+" ");
		}
		
		System.out.println();
		
		sort(ar, 0, ar.length - 1);
		
		System.out.println("After Sorting");
		for(int t = 0; t < n; t++)
		{
			System.out.print(ar[t]+" ");
		}
		
	}
}
