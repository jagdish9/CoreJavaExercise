package com.java.StringAndArray;

import java.util.*;

public class ArrayWithSubArray {

	public static void main(String[] args)
	{

      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int[] ar = new int[N];
      int c = 0;
     for(int i = 0; i < N; i++)
     {
        ar[i] = scan.nextInt(); 
     }
     
     if(N % 2 == 0)
     {
    	 System.out.println("Not Possible");
     }
     else
     {
    	 int mid = N/2;
    	 for(int j = 1; j < mid; j++)
    	 {
    		 c = 0;
    		 int t = j;
    		 while(t >= 1)
    		 {
    		    int temp = ar[mid + t];
    		    ar[mid + t] = ar[mid - t];
    		    ar[mid - t] = temp;
    		    t--;
    	     }
    		 for(int k = 0; k < N - 1; k++)
    		 {
    			 if(ar[k] < ar[k+1])
    			 {
    				 c++;
    			 }
    		 }
    		 
    		 
    	 }
    	 if(c == N - 1)
		 {
			 System.out.println("Possible");
		 }
    	 else
    	 {
    		 System.out.println("Not Possible");
    	 }
     }
     scan.close();
	}

}