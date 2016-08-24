package com.java.exercise;

import java.util.Scanner;

public class BubbleSort {

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
		
		for(int j = 0; j < n - 1; j++)
		{
			for(int k = 0; k < n - j - 1; k++)
			{
				if(ar[k] > ar[k+1])
				{
					int temp = ar[k];
					ar[k] = ar[k+1];
					ar[k+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting");
		for(int x = 0; x < n; x++)
		{
			System.out.print(ar[x]+" ");
		}
		
		scan.close();
	}

}
