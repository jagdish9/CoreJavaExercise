package com.java.rank.map;

import java.math.BigInteger;
import java.util.Scanner;

public class MagicalShop {

	public static void main(String args[] ) throws Exception {
	       
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        scan.nextLine();
        String S = scan.nextLine().trim();
        int len = S.length();
        BigInteger restore = new BigInteger("0");
        BigInteger end_value = new BigInteger("0");
        for(int i = 0; i < len; i++)
        {
        	restore = A;
        	int val = Integer.parseInt(String.valueOf(S.charAt(i)));
        	if(val == 1)
        	{
        		end_value = end_value.add(restore);
        		A = A.multiply(A);
        	}
        	else if(val == 0)
        	{
        		A = A.multiply(A);
        	}
        }
        System.out.println(end_value.mod(B));
        scan.close();
   }
}
