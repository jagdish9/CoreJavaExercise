package com.java.expectation;

import java.util.Scanner;

public class DualIssues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	       int T = scan.nextInt();
	       scan.nextLine();
	       for(int i = 0; i < T; i++)
	       {
	       	 int N = scan.nextInt();
	       	 scan.nextLine();
	       	 int[] arr = new int[N];
	       	 for(int j = 0; j < N; j++)
	       	 {
	       	 	 arr[j] = scan.nextInt();
	       	 }
	       	 
	       	  int max = 0;
	       	  
	       	 for(int k = 0; k < N; k++)
	       	 {
	       	 	int c = 0;
	       	 	for(int t = 2; t < arr[k]; t++)
	       	 	{
	       	 		if(arr[k] % t == 0)
	       	 		{
	       	 			c++;
	       	 		}
	       	 	}
	       	 	if(c == 0)
	       	 	{
	       	 		if(arr[k] > max)
	       	 		{
	       	 			max = arr[k];
	       	 		}
	       	 	}
	       	 }
	       	 if(max > 1)
	       	 {
	       	 	System.out.println(max*max);
	       	 }
	       	 else
	       	 {
	       	 	System.out.println("-1");
	       	 }
	       }
	       scan.close();
	}

}
