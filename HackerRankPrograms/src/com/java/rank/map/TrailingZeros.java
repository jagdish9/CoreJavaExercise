package com.java.rank.map;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	       int N =  scan.nextInt();
	       long fact = 1;
	       for(int i = 1; i <= N; i++)
	       {
	       	 fact = fact * i;
	       }
	       System.out.println(fact);
	       String s = String.valueOf(fact);
	       int len = s.length();
	       int c = 0;
	       for(int j = len - 1; j >= 0; j--)
	       {
	       	 if(0 == Integer.parseInt(String.valueOf(s.charAt(j))))
	       	 {
	       	 	c++;
	       	 }
	       	 else
	       	 {
	       	 	j = -1;
	       	 }
	       }
	       System.out.println(c);
	       scan.close();
	}

}
