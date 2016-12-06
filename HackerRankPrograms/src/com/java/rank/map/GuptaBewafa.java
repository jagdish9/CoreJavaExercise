package com.java.rank.map;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

class GuptaBewafa {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0;  i < T; i++)
        {
        	int st = scan.nextInt();
        	int dt = scan.nextInt();
        	int val = 0;
        	int count = 0;
        	if(st < dt)
        	{
        		while(val < dt)
        		{
        			val = val + 2*st;
        			count++;
        		}
        		
        		while(val != dt)
        		{
        			val = val - 1;
        			count++;
        		}
        	}
        	else if(st > dt)
        	{
        		while(st != dt)
        		{
        			st = st - 1;
        			count++;
        		}
        	}
        	
        	System.out.println(count);
        }
        scan.close();
    }
}

