package com.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountWords {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] str = input.split("\\s");
		List<String> ls = new ArrayList<String>();
		for(String temp : str)
		{
			ls.add(temp);
		}
		
		Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
		Set<String> set = new LinkedHashSet<String>(ls);
		int count = 0;
		for(String temp1 : set)
		{
			count = Collections.frequency(ls, temp1);
			hm.put(temp1, count);
		}
		
		Set<Entry<String, Integer>> set1 = hm.entrySet();
		Iterator<Entry<String, Integer>> it = set1.iterator();
		while(it.hasNext())
		{
			Entry<String, Integer> mentry = it.next();
			System.out.println(mentry.getKey()+" : "+mentry.getValue());
		}
		scan.close();
	}
}
