package com.java.dynamic;

import java.util.Scanner;

public class PalindroneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len = str.length();
		char[] rev = new char[len];
		int j = len - 1;
		for(int i = 0; i < len; i++)
		{ 
			char ch = str.charAt(j);
			 rev[i] = ch;
			 j--;
		}
		int k = 0;
		int count = 0;
		for(int l = 0; l < len; l++)
		{
			char ch1 = str.charAt(k);
			if(rev[l] == ch1)
			{
				count++;
			}
			k++;
		}
		
		if(count == len)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		scan.close();
	}

}
