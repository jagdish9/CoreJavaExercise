package com.java.onlystring;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MixingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        Set<Character> set = new LinkedHashSet<Character>();
	        int N = scan.nextInt();
	        scan.nextLine();
	        String[] str = new String[N];
	        for(int i = 0; i < N; i++)
	        {
	        	str[i] = scan.nextLine();
	        }
	        
	        for(int j = 0; j < N; j++)
	        {
	        	int len = str[j].trim().length();
	        	for(int k = 0; k < len; k++)
	        	{
	        		set.add(str[j].charAt(k));
	        	}
	        }
	        
	        Iterator<Character> it = set.iterator();
	        StringBuilder sb = new StringBuilder();
	        while(it.hasNext())
	        {
	        	sb.append(it.next());
	        }
	        
	        System.out.println(sb.length());
	}

}
