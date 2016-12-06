package com.java.rank.map;

import java.util.Scanner;

class MonksChoice {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < T; i++)
        {
        	int N = scan.nextInt();
        	int K = scan.nextInt();
        	scan.nextLine();
        	int[] arN = new int[N];
        	for(int j = 0; j < N; j++)
        	{
        		arN[j] = scan.nextInt();
        	}
        	int[] aSort = new int[N];
        	for(int k = 0; k < N; k++)
        	{
        		String s = Integer.toBinaryString(arN[k]);
        		int len = s.length();
        		int count = 0;
        		for(int t = 0; t < len; t++)
        		{
        			if(1 == Integer.parseInt(String.valueOf(s.charAt(t))))
        			{
        				count++;
        			}
        		}
        		
        		aSort[k] = count;
        	}
        	
        	for(int x = 0; x < aSort.length; x++)
        	{
        		for(int y = 0; y < aSort.length - x - 1; y++)
        		{
        			if(aSort[y] < aSort[y+1])
        			{
        				int temp = aSort[y];
        				aSort[y] = aSort[y+1];
        				aSort[y+1] = temp;
        			}
        		}
        	}
        	
        	int total = 0;
        	for(int z = 0; z < K; z++)
        	{
        		total = total + aSort[z];
        	}
        	System.out.println(total);
        }
        scan.close();
    }
}

