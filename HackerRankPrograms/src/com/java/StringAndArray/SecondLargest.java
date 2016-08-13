package com.java.StringAndArray;
import java.util.*;

class SecondLargest
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int[] ar = new int[N];
	for(int i = 0; i < N; i++)
	{
	  ar[i] = scan.nextInt();
	}
	
	for(int j = 0; j< N - 1; j++)
	{
	  for(int k = 0; k < N - j - 1; k++)
	  {
	     if(ar[k] > ar[k+1])
		 {
		   int temp = ar[k];
		   ar[k] = ar[k+1];
		   ar[k+1] = temp;
		 }
	  }
	}
	for(int j = 0; j< N; j++)
	{
	 System.out.print(ar[j]+" ");
	}
	System.out.println();
	System.out.println(ar[N-2]);
  }
}

/*

5 3 4 9 6 7 1

*/