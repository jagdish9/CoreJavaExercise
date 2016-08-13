package com.java.StringAndArray;


/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;
import java.math.*;

class StringRepeatWithBigInt {
	
	
	 private static long compare(long x, int len)
       {
       	 if(x > len)
       	 {
       	 	x =  x - len;
       	 	x = compare(x, len);
       	 }
       	 return x;
       }
       
    public static void main(String args[] ) throws Exception {
       
       Scanner scan = new Scanner(System.in);
       String str = scan.next();
       long Q = scan.nextInt();
       for(int i = 0; i < Q; i++)
       {
       	 long a = scan.nextLong();
       	 long b = scan.nextLong();
       	 int len =  str.length();
       	 char[] ch = str.toCharArray();
       	 if(a > len)
       	 {
       	 	a = compare(a, len);
       	 }
       	 
       	 if(b > len)
       	 {
       	 	b = compare(b, len);
       	 }
       	 int x = (int)a;
		 int y = (int)b;
       	 if(ch[x-1] == ch[y-1])
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
