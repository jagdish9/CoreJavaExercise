package com.java.string;

import java.util.Scanner;

public class CrazyKangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        for(int i = 0; i < T; i++)
	        {
	        	int A = scan.nextInt();
	        	int B = scan.nextInt();
	        	int M = scan.nextInt();
	        	int c = 0;
	        	for(int j = A; j<= B; j++)
	        	{
	        		if(j%M == 0)
	        		{
	        			c++;
	        		}
	        	}
	        	System.out.println(c);
	        }
	        scan.close();
	}

}
