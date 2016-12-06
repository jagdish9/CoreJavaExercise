package com.java.expectation;

import java.util.Scanner;

public class PrintHackerearth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine().trim();
        String input = "hackerearth";
        String s = "";
        for(int i = 0; i < input.length(); i++)
        {
        	int count = 0;
        	for(int j = 0; j < N; j++)
        	{
        		if(input.charAt(i) == str.charAt(j))
        		{
        			count++;
        		}
        	}
        	s = s + ""+count;
        }
        if(input.length() == s.length())
        {
        	int min = (int)s.charAt(0);
        	for(int k = 0; k < s.length(); k++)
        	{
        		if((int)s.charAt(k) < min)
        		{
        			min = (int)s.charAt(k);
        		}
        	}
        	System.out.println(min);
        }
        scan.close();
        
	}

}
