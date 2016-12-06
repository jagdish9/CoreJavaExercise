package com.java.rank.map;

import java.util.Scanner;

public class MonkAndFriend {

	public static void main(String args[] ) throws Exception {
	      
	      Scanner scan = new Scanner(System.in);
	      int T = scan.nextInt();
	      scan.nextLine();
	      for(int i = 0; i < T; i++)
	      {
	      	int N = scan.nextInt();
	      	int M = scan.nextInt();
	      	scan.nextLine();
	      	int[] arNM = new int[N+M];
	      	for(int j = 0; j < N+M; j++)
	      	{
	      		arNM[j] = scan.nextInt();
	      	}
	      	
	      	for(int k = N; k < N+M; k++)
	      	{
	      		int val = N-1;
	      		int exist = arNM[k];
	      		boolean flag = false;
	      		while(val >= 0)
	      	     {
	      	     	if(exist == arNM[val])
	      	     	{
	      	     		flag = true;
	      	     	}
	      	     	val--;
	      	     }
	      	     if(flag)
	      	     {
	      	     	System.out.println("YES");
	      	     }
	      	     else
	      	     {
	      	     	System.out.println("NO");
	      	     }
	      	}
	      }
	      scan.close();
	    }
}
