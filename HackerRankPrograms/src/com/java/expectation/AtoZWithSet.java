package com.java.expectation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtoZWithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(char ch = 'a'; ch <= 'z'; ch++)
		{
			sum = sum + (int)ch;
		}
	       Scanner scan = new Scanner(System.in);
	       int T = scan.nextInt();
	       Set<Character> set_1 = new HashSet<Character>();
	       scan.nextLine();
	       for(int i = 0; i < T; i++)
	       {
	       	 String str = scan.nextLine().trim();
	       	 int len = str.length();
	       	 for(int j = 0; j < len; j++)
	       	 {
	       	  set_1.add(str.charAt(j));	 
	       	 }
	       	 
	       	 int val = 0;
	       	 
	       	Iterator<Character> it = set_1.iterator();
	       	while(it.hasNext())
	       	{
	       		val = val + (int)it.next();
	       	}
	       	
	       	 if(sum == val)
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
