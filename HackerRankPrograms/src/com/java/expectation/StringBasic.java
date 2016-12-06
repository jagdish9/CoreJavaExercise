package com.java.expectation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String str = "Aarya";
		String str1 = new String("Aarya");
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i)+" ");
		} */
		
		Map<String, Integer> _map = new HashMap<String, Integer>();
		_map.put("h", 10);
		_map.put("ha", 20);
		_map.put("hac", 30);
		_map.put("hack", 40);
		_map.put("hacker", 50);
		
		Iterator<Map.Entry<String, Integer>> _it = _map.entrySet().iterator();
		while(_it.hasNext())
		{
			Map.Entry<String, Integer> _mapentry= (Map.Entry<String, Integer>)_it.next();
			System.out.println(_mapentry.getKey()+" "+_mapentry.getValue());
		}
				
	}

}
