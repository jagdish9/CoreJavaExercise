package com.java.rank.map;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

class TheMagic02 {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < T; i++)
        {
        	int N = scan.nextInt();
        	int stone = 0;
        	int S = N;
        	int k = 0;
        	while(k != N && k < N)
        	{
        		int j = 1;
        		int val = 0;
        		while(j < S)
        		{
        			val = j;
        			j = j * 2;
        		}
        		S =  val;
        		k = k + val;
        		stone++;
        	}
        	System.out.println(stone);
        }
        scan.close();
    }
}

