package com.java.string;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class JimAndOrders02 {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	        for(int i = 1; i <= n; i++)
	            {
	            int t = scan.nextInt();
	            int d = scan.nextInt();
	            map.put(t+d, i);
	        }
	        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
	        Iterator it = set.iterator();
	        while(it.hasNext())
	            {
	            Map.Entry<Integer, Integer> mentry = (Map.Entry)it.next();
	            System.out.print(mentry.getValue()+" ");
	        }
	    }
}
