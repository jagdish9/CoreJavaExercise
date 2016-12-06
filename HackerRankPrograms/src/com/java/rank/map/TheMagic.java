package com.java.rank.map;

import java.util.Scanner;

public class TheMagic {

public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < T; i++)
        {
        	int N = scan.nextInt();
        	int stone = 0;
        	int j = 1;
        	while(j <= N)
        	{
        		j = j + 1;
        		j = j + j;
        		stone++;
        	}
        	System.out.println(stone);
        }
        scan.close();
    }
}
