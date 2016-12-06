package com.java.onmobile;

import java.util.Scanner;

public class FindIndexOfSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		int len = s2.length();
		int i = 0;
		int s2_ascii = 0;
		while(i<len)
		{
			s2_ascii = s2_ascii + (int)s2.charAt(i);
			i++;
		}
		int j = 0;
		int s1_ascii = 0;
		int start_index = 0;
		int end_index = 0;
		int l = 0;
		while(j<s1.length())
		{
			s1_ascii = s1_ascii + (int)s1.charAt(j);
			if(l == len-1)
			{
				l = 0;
				s1_ascii = s1_ascii-(int)s1.charAt(j-2);
			}
			if(s1_ascii == s2_ascii)
			{
				start_index = j;
				end_index = j+len-1;
				return;           
			}
			j++;
			l++;
		}
		System.out.println(start_index+" "+end_index);
		scan.close();
	}         

}
