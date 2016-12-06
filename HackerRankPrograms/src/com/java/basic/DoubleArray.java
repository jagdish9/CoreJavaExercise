package com.java.basic;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int M = scan.nextInt();
	        int K = scan.nextInt();
	        int X = scan.nextInt();
	        int[][] arNM = new int[N][M];
	        scan.nextLine();
	        for(int i = 0; i < N; i++)
	        {
	        	for(int j = 0; j < M; j++)
	        	{
	        		arNM[i][j] = scan.nextInt();
	        	}
	        	scan.nextLine();
	        }
	    /*    for(int i = 0; i < N; i++)
	        {
	        	for(int j = 0; j < M; j++)
	        	{
	        		System.out.print(arNM[i][j]+" ");
	        	}
	        	System.out.println();
	        } */
	        
	        int l = 0;
	        while(l<2)
	        {
	        	int t = 1;
	            while(t<N)
	        	{
	        	   int x = 1;
	            while(x<M)
	            {
	        	 	for(int i = 0; i <= t; i++)
	            {
	            	for(int j = 0; j <= x; j++)
	         	  {
	         	  	  arNM[i][j] = scan.nextInt();
	         	  }
	            }
	            	x++;
	            } 
	            t++;
	           }
	            l++;
	         }
	        }
	       
	}

