package com.java.rank.map;

import java.util.Scanner;

public class MagicalShop2 {

	public static void main(String args[] ) throws Exception {
	       
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        scan.nextLine();
        String S = scan.nextLine().trim();
        int len = S.length();
        long restore = 0;
        long end_value = 0;
        for(int i = 0; i < len; i++)
        {
        	restore = A;
        	int val = Integer.parseInt(String.valueOf(S.charAt(i)));
        	if(val == 1)
        	{
        		end_value = end_value + restore;
        		A = A * A;
        	}
        	else if(val == 0)
        	{
        	  A = A * A;
        	}
        }
        System.out.println(end_value % B);
        scan.close();
   }
}
