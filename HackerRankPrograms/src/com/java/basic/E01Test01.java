package com.java.basic;

import java.util.Scanner;

public class E01Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int count = 0;
		int[] A = new int[T];
		for(int i = 0; i < T; i++)
		{
			A[i] = scan.nextInt();
		}
		
		for(int j = 0; j < T; j++)
		{
			int val = A[j];
			for(int k = j+1; k < T; k++)
			{
				if(val < A[k])
				{
					val = A[k];
					for(int l = k+1; l < T; l++)
					{
						if(val > A[l])
						{
							count++;
						}
					}
				}
				
				if(val > A[k])
				{
					val = A[k];
					for(int l = k+1; l < T; l++)
					{
						if(val < A[l])
						{
							count++;
						}
					}
				}
				
			}
			
			
		}
		System.out.println(count);
		
		scan.close();
	}

}
