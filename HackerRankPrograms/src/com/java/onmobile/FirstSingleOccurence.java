package com.java.onmobile;

import java.util.Scanner;

public class FirstSingleOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int len = s.length();
		int i = 0;
		while(i<len)
		{
			char ch = s.charAt(i);
			int j = i+1;
			int c = 0;
			while(j<len)
			{
				if(s.charAt(j) == ch)
				{
					c++;
				}
				j++;
			}
			int k = i-1;
			while(k>=0)
			{
				if(s.charAt(k) == ch)
				{
					c++;
				}
				k--;
			}
			if(c == 0)
			{
				System.out.println(ch);
				return;
			}
			i++;
		}
		scan.close();
	}

}
