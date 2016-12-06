package com.java.edgeverve;

public class Test04 {

	public static int maxScan(int[] array)
	{
		if(array.length == 0)
			return -1;
		else if(array.length == 1) 
			return array[0];
		else
		{	
			int maxSum = array[0];
			int current_max = array[0];
			for(int i = 1; i < array.length; i++)
			{
				current_max = Math.max(array[i], current_max + array[i]); 
				maxSum = Math.max(maxSum, current_max);
			}
			return maxSum;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {20, 5, 3, -2, -1, -5, 43, 24};
		System.out.println(maxScan(arr));
	}

}

//passed successfully all test cases