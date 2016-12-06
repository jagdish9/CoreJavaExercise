package com.java.expectation;

import java.util.Scanner;

public class SumitAndRohil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        scan.nextLine();
	        String[] str = new String[N];
	        for(int i = 0; i < N; i++)
	        {
	        	str[i] = scan.nextLine().trim();
	        }
	        
	      /*  for(int i = 0; i < N; i++)
	        {
	        	System.out.println(str[i]);
	        } */
	        int count = 0;
	        
	        for(int i = 0; i < N; i++)
	         {
	        	int len = str[i].length();
	        	int val = 0;
	        	 for(int j = 0; j < len; j++)
	 	         {
	 	        	val = val + (int)str[i].charAt(j);
	 	         }
	        	 
	        	 for(int k = i+1; k < N; k++)
	        	 {
	        		 int lenRem = str[k].length();
	        		 int valRem = 0;
	        		 for(int l = 0; l < lenRem; l++)
	        		 {
	        			valRem = valRem + (int)str[k].charAt(l); 
	        		 }
	        		 
	        		 if(val == valRem)
	        		 {
	        			 if(str[i].charAt(len-1) == str[k].charAt(lenRem-1) 
	        					 && str[k].charAt(0) == str[i].charAt(0))
	        			 {
	        				 count++;
	        			 }
	        		 }
	        	 }
	         }
	        System.out.println(count);
	        scan.close();
	        
	}

}
