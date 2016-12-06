package com.java.expectation;

import java.util.Scanner;

public class MyPrime {

	public static void main(String args[] ) throws Exception {
	      
	      Scanner scan = new Scanner(System.in);
	      int N = scan.nextInt();
	      int[] S = new int[N];
	      scan.nextLine();
	      for(int i = 0; i < N; i++)
	      {
	      	S[i] = scan.nextInt();
	      }
	      
	    //  System.out.println();
	      
	      for(int j = 0; j < N; j++)
	      {
	      	int c = 0;
	      	int k = j-1;
	      	while(k >= 0)
	      	{
	      		if(S[j] % S[k] == 0)
	      		{
	      			c++;
	      		}
	      		k--;
	      	}
	      	
	      	int l = j+1;
	      	while(l < N)
	      	{
	      		if(S[j] % S[l] == 0)
	      		{
	      			c++;
	      		}
	      		l++;
	      	}
	      	
	      	if(c == 0)
	      	{
	      		System.out.print(S[j]+" ");
	      	}
	      }
	      scan.close();
	    }
}
