package com.java.StringAndArray;
import java.util.*;

class DuplicateFromTwoArrays
{
 public static void main(String[] args)
 {
   Scanner scan = new Scanner(System.in);
   int N1 = scan.nextInt();
   int[] ar1 = new int[N1];
   for(int i = 0; i < N1; i++)
   {
     ar1[i] = scan.nextInt();
   }
   int N2 = scan.nextInt();
   int[] ar2 = new int[N2];
   for(int i = 0; i < N2; i++)
   {
     ar2[i] = scan.nextInt();
   }
   
   for(int j = 0; j < N1 - 1; j++)
   {
     for(int k = 0; k < N1 - j - 1; k++)
	 {
	   if(ar1[k] > ar1[k+1])
	   {
	     int temp = ar1[k];
		 ar1[k] = ar1[k+1];
		 ar1[k+1] = temp;
	   }
	 }
   }
   
    for(int j = 0; j < N2 - 1; j++)
   {
     for(int k = 0; k < N2 - j - 1; k++)
	 {
	   if(ar2[k] > ar2[k+1])
	   {
	     int temp = ar2[k];
		 ar2[k] = ar2[k+1];
		 ar2[k+1] = temp;
	   }
	 }
   }
    
	for(int l = 0; l < N1; l++)
	{
	   for(int t = 0; t < N2; t++)
	   {
	     if(ar1[l] == ar2[t])
		 {
		   System.out.println("Duplicate: "+ar1[l]);
		 }
	   }
	}
   
   scan.close();
 }
}