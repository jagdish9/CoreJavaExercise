package com.java.StringAndArray;
/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;

class StringRepeatation {
	
	 public static int compare(int x, int len)
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
       int Q = scan.nextInt();
       for(int i = 0; i < Q; i++)
       {
       	 int a = scan.nextInt();
       	 int b = scan.nextInt();
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
       	 
       	 if(ch[a-1] == ch[b-1])
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
