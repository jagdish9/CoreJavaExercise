package com.java.string;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {

	 public static void main(String[] args) {
	        Scanner stdin=new Scanner(System.in);
	        int n=stdin.nextInt(),k=stdin.nextInt();
	        int prices[]=new int[n];
	        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
	        Arrays.sort(prices);
	        int answer = 0;
	        // Compute the final answer from n,k,prices 
	        int sum = 0;
	        for(int j = 0; j < n; j++)
	            {
	            if(sum <= k)
	                {
	                sum = sum + prices[j];
	                answer++;
	            }
	        }
	        System.out.println(answer-1);
	        stdin.close();
	    }
}
