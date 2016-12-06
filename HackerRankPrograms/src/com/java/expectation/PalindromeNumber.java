package com.java.expectation;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < T; i++)
        {
        	int A = scan.nextInt();
        	int B = scan.nextInt();
        	int c = 0;
        	for(int j = A; j <= B; j++)
        	{
        		String strA = String.valueOf(j).trim();
        		int k = 0;
        		int lengt = strA.length();
        		int l = lengt - 1;
        		boolean flag = false;
        		while(k < lengt && l >= 0)
        		{
        			if(strA.charAt(k) == strA.charAt(l))
        			{
        				flag = true;
        			}
        			k++;
        			l--;
        		}
        		if(flag)
        		{
        			c++;
        		}
        	}
        	System.out.println(c);
        }
        scan.close();
	}

}
