package com.java.basic.tricky;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Sorting implements Comparator<Map.Entry<Integer, String>>
{

	public int compare(Map.Entry<Integer, String> arg0, Map.Entry<Integer, String>  arg1) {
		return arg0.getValue().compareTo(arg1.getValue());
		
	}
	
}
public class HashMapSorting {

	public static Map<Integer, String> sortByValue(Map<Integer, String> map1)
	{
	  	List<Map.Entry<Integer, String>> ls = 
	  			new LinkedList<Map.Entry<Integer, String>>(map1.entrySet());
	  	
	  	Collections.sort(ls, new Sorting());
	  	
	  	Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
	  	for(Map.Entry<Integer, String> list : ls)
	  	{
	  		sortedMap.put(list.getKey(), list.getValue());
	  	}
	  	
	  	return sortedMap;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(10, "Anamika");
		hmap.put(18, "Swati");
		hmap.put(27, "Sanjana");
		hmap.put(16, "Vijaya");
		hmap.put(33, "Biswa");
		
		System.out.println("Sort by Key");
		Map<Integer, String> sortByKey = 
				new TreeMap<Integer, String>(hmap);
		for(Map.Entry<Integer, String> ent : sortByKey.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		System.out.println();
		
		System.out.println("Sort by Value");
		Map<Integer, String> map1 = sortByValue(hmap);
		
		Set<Map.Entry<Integer, String>> set1 = map1.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = set1.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entries = (Map.Entry<Integer, String>)it.next();
			System.out.println(entries.getKey()+" "+entries.getValue());
		}
		
	}

}
