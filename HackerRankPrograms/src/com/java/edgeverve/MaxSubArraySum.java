package com.java.edgeverve;

import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < n; i++)
	            {
	            arr[i] = scan.nextInt();
	        }
	        
	        int val = 0;
	        int max = 0;
	        for(int i = 0; i < n; i++)
	            {
	        	max = 0;
	            for(int j = i; j < n; j++)
	                {
	                val = val + arr[j];
	            }
	            if(val > max)
	                {
	                max = val;
	            }
	        }
	        System.out.println(max);
	        scan.close();
	}

}
