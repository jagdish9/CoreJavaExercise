package com.java.lenskart;

import java.util.Scanner;

public class VasyaRehzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        scan.nextLine();
	        int[] arN = new int[N];
	        int[] brN = new int[N];
	        for(int i = 0; i < N; i++)
	        {
	        	arN[i] = scan.nextInt();
	        }
	        scan.nextLine();
	         for(int j = 0; j < N; j++)
	         {
	        	brN[j] = scan.nextInt();
	         }
	         scan.nextLine();
	         int Q = scan.nextInt();
	         scan.nextLine();
	         for(int k = 0; k <  Q; k++)
	         {
	           int L = scan.nextInt();
	           int R = scan.nextInt();
	           int sum = arN[L-1];
	           int index = L-1;
	           int times = 1;
	           int same = 0;
	           int ma_01_index = L-1;
	           int ma_02_index = 0;
	           for(int t = L; t < R; t++)
	           {
	           	 if(arN[t]>sum)
	           	 {
	           	 	sum = arN[t];
	           	 	times++;
	           	 	index = t;
		        	ma_01_index = t;
	           	 }
	           	 else if(arN[t] == sum)
	           	 {
	           		 same++;
	           		ma_02_index =  t;
	           	 }
	           }
	           if(times >= 1 && same == 0)
	           {
	        	   System.out.println(index+1);
	           }
	           else if(same >= 1)
	           {
	        	   if(arN[ma_01_index] == brN[ma_01_index])
	        	   {
	        		   if(arN[ma_02_index] > brN[ma_01_index])
	        		       System.out.println(ma_02_index+1);
	        		   else
	        			   System.out.println(ma_02_index+1);
	        	   }
	        	   else if(arN[ma_02_index] > brN[ma_02_index])
	        		   System.out.println(ma_02_index+1);
	           }
	         }
	        scan.close();
	}

}

/*
5
1 8 4 6 8
4 8 6 3 7
4
1 4
2 4
3 4
1 5
*/

/* output
2
2
4
5
*/