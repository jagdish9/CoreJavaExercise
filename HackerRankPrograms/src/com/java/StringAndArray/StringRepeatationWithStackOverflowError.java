package com.java.StringAndArray;

import java.math.BigInteger;
import java.util.Scanner;

public class StringRepeatationWithStackOverflowError{
	 private static BigInteger compare(BigInteger x, BigInteger len)
       {
       	 if(1 == x.compareTo(len))
       	 {
       	 	x =  x.subtract(len);
       	 	x = compare(x, len);
       	 }
       	 return x;
       }
       
       private static BigInteger bigValue(int val)
       {
       	String s = Integer.toString(val); 
        BigInteger big = new BigInteger(s);
       	 return big;
       }
       
    public static void main(String args[] ) throws Exception {
       
       Scanner scan = new Scanner(System.in);
       String str = scan.next();
       BigInteger len =  bigValue(str.length());
       int Q = scan.nextInt();
       for(int i = 0; i < Q; i++)
       {
       	 BigInteger a = scan.nextBigInteger();
       	 BigInteger b = scan.nextBigInteger();
       	 char[] ch = str.toCharArray();
       	 BigInteger inp = len;
       	 if(1 == a.compareTo(inp))
       	 {
       	 	a = compare(a, len);
       	 }
       	 
       	 if(1 == b.compareTo(inp))
       	 {
       	 	b = compare(b, len);
       	 }
       	 int vals = 1;
       	 BigInteger x = ch[a.subtract(bigValue(vals))];
       	 BigInteger y = ch[b.subtract(bigValue(vals))];
       	 if(1 == x.compareTo(y))
       	 {
       	 	System.out.println("Yes");
       	 }
       	 else
       	 {
       	 	System.out.println("No");
       	 }
       }
       
      
    }
    }