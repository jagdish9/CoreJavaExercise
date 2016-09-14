package com.java.basic;

import java.util.Scanner;

public class E01Test02 {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	int c = 0;
	for(int i = 0; i < T; i++)
	{
		String input = scan.nextLine();
		int len = input.length();
	   if(input.startsWith("a"))
		{
		 for(int j = 0; j < len - 1; j++)
		 {
			char ch = input.charAt(j);
			if(ch < input.charAt(j+1))
			{
				c++;
			}
		 }
		}
	   else
	   {
		   System.out.println();
	   }
		if(c == len - 1)
		{
			
		}
	}
	
	scan.close();
	}
}
