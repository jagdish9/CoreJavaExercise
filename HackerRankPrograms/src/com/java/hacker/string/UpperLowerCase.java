package com.java.hacker.string;

import java.util.Scanner;

public class UpperLowerCase {

	 public static void main(String args[] ) throws Exception {
	       
	       Scanner scan = new Scanner(System.in);
	       String str = scan.nextLine().trim();
	       char[] ch = str.toCharArray();
	       int i = 0;
	       while(i<str.length())
	       {
	       	 if(Character.isLowerCase(ch[i]))
	       	 {
	       	  ch[i] = Character.toUpperCase(ch[i]);
	       	 }
	       	 else
	       	 {
	       	  ch[i] = Character.toLowerCase(ch[i]);
	       	 }
	       	 i++;
	       }
	       for(int j = 0; j<ch.length; j++)
	       {
	       	 System.out.print(ch[j]);
	       }
	       scan.close();
	    }
}
