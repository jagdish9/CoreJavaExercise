package com.java.onmobile;

import java.util.Scanner;

public class FindSubstringIndex {

	public static void main(String[] args)
	  {
	    Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine().trim();
		String s2 = scan.nextLine().trim();
		int _len_s1 = s1.length();
		int i = 0;
		int _start_index = 0;
		int _end_index = 0;
		while(i < _len_s1-2)
		{
		  String res = s1.substring(i, i+3);
		  //System.out.print(res+" ");
		  
		  if(res.equalsIgnoreCase(s2))
		  {
		    _start_index = i;
		    _end_index = i+2;
			//return;
		  }
		  i++;
		}
		System.out.println(_start_index+" "+_end_index);
		scan.close();
	  }
}
