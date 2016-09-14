package com.java.onlystring;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueString01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	       Scanner scan = new Scanner(System.in);
	       Set<Character> set = new LinkedHashSet<Character>();
	       int T = scan.nextInt();
	       scan.nextLine();
	       for(int i = 0; i <= T; i++)
	       {
	       	 String input = scan.nextLine();
	       	 int len = input.length();
	       	 for(int j = 0; j < len; j++)
	       	 {
	       	 	set.add(input.charAt(j));
	       	 }
	       	 
	       	 Iterator<Character> it = set.iterator();
	       	 StringBuilder str = new StringBuilder();
	       	 while(it.hasNext())
	       	 {
	       	 	str.append(it.next());
	       	 }
	       	 System.out.println(str);
	       	 str = str.delete(0, str.length());
	       	 set.clear();
	       }
	       scan.close();
	}

}
