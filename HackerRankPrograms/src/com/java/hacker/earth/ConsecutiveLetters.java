package com.java.hacker.earth;

import java.util.Scanner;

public class ConsecutiveLetters {

	 public static void main(String args[] ) throws Exception {
	        

	        Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        for(int i = 0; i < T; i++)
	        {
	        	String input = scan.next();
	        	input = input + " ";
	        	int len = input.length();
	        	String ans = "";
	        	char ch1, ch2;
	        	
	        	for(int j = 0; j < len - 1; j++)
	        	{
	        		ch1 = input.charAt(j);
	        		ch2 = input.charAt(j+1);
	        		
	        		if(ch1 != ch2)
	        		{
	        			ans = ans + ch1;
	        		}
	        	}
	        	System.out.println(ans);
	        	
	        }
	        
	        scan.close();
	    }
}
