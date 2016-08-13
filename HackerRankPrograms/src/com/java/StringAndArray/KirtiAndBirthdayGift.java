package com.java.StringAndArray;
import java.util.*;

class KirtiAndBirthdayGift {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] aStr = new String[N];
        for(int i = 0; i < N; i++)
        {
        	aStr[i] = scan.next();
        }
        
        int Q = scan.nextInt();
        for(int j = 0; j < Q; j++)
        {
        	int c = 0;
        	int l = scan.nextInt();
        	int r = scan.nextInt();
        	String S = scan.next();
        	for(int k = 0; k < r; k++)
        	{
        		if(aStr[k].equals(S))
        		{
        			c++;
        		}
        	}
        	System.out.println(c);
        }
    }
}