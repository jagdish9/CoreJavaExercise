package com.java.rank.map;

import java.util.Scanner;

public class BestInternetBrowser {

public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int j = 0; j < T; j++)
        {
        	String _str = scan.nextLine().trim();
        	int _len = _str.length();
        	int c = 0;
        	for(int i = 0; i < _len; i++)
        	{
        	if(String.valueOf(_str.charAt(i)).equals("a") || String.valueOf(_str.charAt(i)).equals("e") || String.valueOf(_str.charAt(i)).equals("i") || String.valueOf(_str.charAt(i)).equals("o") || String.valueOf(_str.charAt(i)).equals("u"))
            	{
        		  c++;
        	    }
        	}
        	int k = (c - 1)+4;
        	System.out.println((_len - k)+"/"+_len);
        }
        scan.close();
    }

}
