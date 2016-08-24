package com.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String02 {

public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        
        List<String> ls = new ArrayList<String>();
        for(int i = 0; i < K; i++)
        {
            ls.add(scan.next());
        } 
        
        scan.nextLine();
        int nos = scan.nextInt();
        scan.nextLine();
        String sent = scan.nextLine();
        String[] input = sent.split(" ");
        
        List<String> ls1 = new ArrayList<String>();
        for(String str1 : input)
        {
        	ls1.add(str1);
        }
        ls1.removeAll(ls);
        if(!ls1.isEmpty())
        {
        	int siz = ls1.size();
        	int c = 0;
        	for(String temp1 : ls1)
        	{
        		String sr = temp1.toUpperCase();
        		char ch = sr.charAt(0);
        		if(c == siz - 1)
        		{
        			System.out.print(ch);
        		}
        		else
        		{
        		   System.out.print(ch+".");
        		}
        		c++;
        	}
        }
        scan.close();
    }

}
