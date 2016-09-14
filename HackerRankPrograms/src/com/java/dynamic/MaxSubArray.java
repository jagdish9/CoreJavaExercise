package com.java.dynamic;

import java.util.Scanner;

public class MaxSubArray {

	private static int maxSubArraySum(int[] ar)
	{
		int size = ar.length;
		 int max_so_far = 0, max_ending_here = 0;
		   for (int i = 0; i < size; i++)
		   {
		       max_ending_here = max_ending_here + ar[i];
		       if (max_ending_here < 0)
		           max_ending_here = 0;
		 
		       /* Do not compare for all elements. Compare only   
		          when  max_ending_here > 0 */
		       else if (max_so_far < max_ending_here)
		           max_so_far = max_ending_here;
		   }
		   return max_so_far;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++)
		{
			ar[i] = scan.nextInt();
		}
		System.out.println(maxSubArraySum(ar));
		scan.close();
	}

}
