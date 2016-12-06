package com.java.rank.map;

import java.math.BigInteger;
import java.util.Scanner;

public class MirrorNumber {

	public static void main(String args[] ) throws Exception {
	       
	       Scanner scan = new Scanner(System.in);
	       int T = scan.nextInt();
	       scan.nextLine();
	       for(int i = 0; i < T; i++)
	       {
	       	 BigInteger N = scan.nextBigInteger();
	       	 String str = "" + N;
	       	 int len = str.length();
	       	  int k = len - 1;
	       	  int j = 0;
	       	  int count = 0;
	       	  while(k >= 0 && j < len)
	       		 {
	       			 if(str.charAt(j) == str.charAt(k))
	       			 {
	       				 count++;
	       			 }
	       			 k--;
	       			 j++;
	       		 }
	       	  if(len == count)
	       	  {
	       		  System.out.println("YES");
	       	  }
	       	  else
	       	  {
	       		System.out.println("NO");
	       	  }
	       }
	       scan.close();
	}
}
