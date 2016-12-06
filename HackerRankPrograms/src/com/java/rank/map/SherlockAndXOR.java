package com.java.rank.map;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

class SherlockAndXOR {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < T; i++)
        {
        	int N = scan.nextInt();
        	scan.nextLine();
        	int[] arN = new int[N];
        	for(int j = 0; j < N; j++)
        	{
        		arN[j] = scan.nextInt();
        	}
        	int count = 0;
           for(int k = 0; k < N; k++)
        	{
        		String str = Integer.toBinaryString(arN[k]);
                 if(str.length() == 1)
                 {
                	 str = "00" + str; 
                 }
        		int len = str.length();
        		for(int l = k+1; l < N; l++)
        		{
        			String s = Integer.toBinaryString(arN[l]);
        			int lenth = s.length();
        			String stg = "";
        			int x = 0;
        			while(x < len && x < lenth)
        			{
        				if(Integer.parseInt(String.valueOf(str.charAt(x))) == Integer.parseInt(String.valueOf(s.charAt(x))))
        				{
        					stg = stg + 0;
        				}
        				else
        				{
        					stg = stg + 1;
        				}
        				x++;
        			}
        			int val = Integer.parseInt(stg, 2);
        			if(val % 2 != 0)
        			{
        				count++;
        			}
        		}
        	}
        	System.out.println(count);
        }
        scan.close();
    }
}

