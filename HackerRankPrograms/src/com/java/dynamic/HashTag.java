package com.java.dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		scan.nextLine();
		List<String> ls = new ArrayList<String>();
		String[] str = new String[M];
		for(int i = 0; i < M; i++)
		{
			str[i] = scan.nextLine();
		}
		int len = 0;
		for(int i = 0; i < M; i++)
		{
			String[] spl = str[i].split(" ");
			len = spl.length;
			for(int j = 0; j < len; j++)
			{
				if(spl[j].startsWith("#"))
				{
					ls.add(spl[j]);
				}
			}
		}
		Set<String> set = new HashSet<String>(ls);
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		int value = 0;
		for(String temp : set)
		{
			value = Collections.frequency(ls, temp);
			map.put(temp, value);
		}
		
		Set set1 = map.entrySet();
		Iterator it = set1.iterator();
		int no = 0;
		while(it.hasNext())
		{
			Map.Entry mentry = (Map.Entry)it.next();
			int retr = (Integer) mentry.getValue();
			if(retr == N && no < N)
			{
				System.out.println(mentry.getKey());
				no++;
			}
		}
		
		scan.close();
	}

}
