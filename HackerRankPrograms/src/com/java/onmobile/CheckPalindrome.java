package com.java.onmobile;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len = str.length();
		int i = 0;
		int j = len - 1;
		int count = 0;
		while(i<len && j>= 0)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				count++;
			}
			i++;
			j--;
		}
		
		if(count == len)
		  System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		scan.close();
	}

}
