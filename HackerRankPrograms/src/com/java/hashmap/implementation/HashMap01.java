package com.java.hashmap.implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("a", "Meghana");
		hmap.put("b", "jamuna");
		hmap.put("c", "saraswati");
		hmap.put("a", "mahanadi");
		hmap.put("a", "yamuna");
		
		Iterator<Map.Entry<String, String>> it = hmap.entrySet().iterator();

        while(it.hasNext())
        {
        	Map.Entry<String, String> mentry = it.next();
        	System.out.println("Key: "+mentry.getKey()+", Value: "+mentry.getValue());
        	System.out.println(mentry.getKey()+" "+mentry.hashCode());
        }
		
	}

}
