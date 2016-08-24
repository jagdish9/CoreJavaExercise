package com.java.hacker.earth;

import java.util.Scanner;

public class GirlfriendForLove {

	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] S = new int[n];
        int[] C = new int[n];
        int[] mul = new int[n];
        for(int i = 0; i < n; i++)
        {
        	S[i] = scan.nextInt();
        }
         for(int i = 0; i < n; i++)
         {
        	C[i] = scan.nextInt();
         }
         int j = 0;
         while(j<n)
         {
         	mul[j] = S[j]*C[j];
         	j++;
         }
         int sum = 0;
         for(int k = 0; k < n; k++)
         {
         	sum = sum + mul[k];
         }
         System.out.println(sum);
         scan.close();
	}
}
