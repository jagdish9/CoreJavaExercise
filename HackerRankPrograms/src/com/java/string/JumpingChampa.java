package com.java.string;

import java.util.Scanner;

public class JumpingChampa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        for(int i = 0; i < T; i++)
	        {
	        	int N = scan.nextInt();
	        	int Q = scan.nextInt();
	        	int[] arN = new int[N];
	        	for(int j = 0; j < N; j++)
	        	{
	        		arN[j] = scan.nextInt();
	        	}
	        	for(int k = 0; k < N; k++)
	        	{
	        		for(int l = 0; l < N-k-1; l++)
	            	{
	        		   if(arN[l] > arN[l+1])
	        		   {
	        		   	 int temp = arN[l];
	        		   	 arN[l] = arN[l+1];
	        		   	 arN[l+1] = temp;
	        		   }
	            	}
	        	}
	        	
	        	int sum = 0;
	        	if(N > 1)
	        	{
	        		for(int t = 0; t < N - 1; t++)
	        		{
	        			sum = sum + Math.abs(arN[t] - arN[t+1]);
	        		}
	        	}
	        	System.out.println(sum*Q);
	        }
	        scan.close();
	}

}
