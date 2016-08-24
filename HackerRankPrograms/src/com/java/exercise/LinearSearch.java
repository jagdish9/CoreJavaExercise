package com.java.exercise;

import java.util.Scanner;

public class LinearSearch {

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
		int count = 0;
		for(int j = 0; j < n; j++)
		{
			if(search == ar[j])
			{
				System.out.println(search+" element is present at index "+j);
				break;
			}
			count++;
		}
		if(count == n)
		{
			System.out.println(search+" element is not available");
		}
		scan.close();
	}

}
