package com.java.exercise;

import java.util.Scanner;

public class BinarySearch {

	private static int binSearch(int[] ar, int s)
	{
		int r = ar.length - 1;;
		int l = 0;
		while(l <= r)
		{
			int mid = l + (r - l)/2;
			if(ar[mid] == s)
				return mid;
			
			if(ar[mid] < s)
				l = mid + 1;
			else if(ar[mid] > s)
				r = mid - 1;
				
		}
		
		return -1;
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
		int search = scan.nextInt();
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
		int result = binSearch(ar, search);
		if(result == -1)
			System.out.println("Element "+search+" is not available");
		else
			System.out.println("Element "+search+" is available at index "+result);
		scan.close();
	}

}
