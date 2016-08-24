package com.java.string;

import java.util.Scanner;

public class JimAndOrders {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[][] ar = new int[n][2];
	        for(int i = 0; i < n; i++)
	            {
	              int t = scan.nextInt();
	              int d = scan.nextInt();
	              int k  = i;
	              ar[i][0] = k+1;
	               for(int j = 1; j < 2; j++)
	                {
	                   ar[i][j] = t+d;
	                }
	            }
	                                
	             for(int t = 0; t < n - 1; t++)
	            {
	               for(int m = 0; m < 2; m++)
	                {
	                   if(m == 1)
	                       {
	                	   for(int l = 0; l < n - 1 - 1; l++)
	                	   {
	                         if(ar[l][m] > ar[l+1][m])
	                             {
	                               int temp = ar[l][m];
	                               ar[l][m] = ar[l+1][m];
	                               ar[l+1][m] = temp;
	                             
	                               int temp1 = ar[l][m-1];
	                               ar[l][m-1] = ar[l+1][m-1];
	                               ar[l+1][m-1] = temp1;  
	                             }
	                	   }
	                       }
	                }
	            }
	        
	        for(int l = 0; l < n; l++)
	            {
	            System.out.print(ar[l][0]+" ");
	        }
	        scan.close();
	    }
}
