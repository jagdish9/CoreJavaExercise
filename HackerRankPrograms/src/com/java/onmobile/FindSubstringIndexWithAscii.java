package com.java.onmobile;

import java.util.Scanner;

public class FindSubstringIndexWithAscii {

	public static void main(String[] args)
	  {
	    Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine().trim();
		String s2 = scan.nextLine().trim();
		int _len_s1 = s1.length();
		int _len_s2 = s2.length();
		int i = 0;
		int _start_index = 0;
		int _end_index = 0;
		int _s2_ascii = 0;
		int _res_ascii = 0;
		
		  int j = 0;
		  while(j < _len_s2)
		  {
		    _s2_ascii = _s2_ascii + (int)s2.charAt(j);
			j++;
		  }
		  
		while(i < _len_s1-2)
		{
		  String res = s1.substring(i, i+3);
		  
		  int k = 0;
		  while(k < res.length())
		  {
		    _res_ascii = _res_ascii + (int)res.charAt(k);
			k++;
		  }
		  
		  if(res.equalsIgnoreCase(s2) || _s2_ascii == _res_ascii)
		  {
		    _start_index = i;
		    _end_index = i+2;
		  }
		  _res_ascii = 0;
		  i++;
		}
		System.out.println(_start_index+" "+_end_index);
		scan.close();
	  }
}
