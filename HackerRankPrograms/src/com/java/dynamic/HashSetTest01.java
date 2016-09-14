package com.java.dynamic;

import java.util.Set;
import java.util.TreeSet;

public class HashSetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		set.add("#INDRockz");
		set.add("#INDRockZ");
		set.add("#Hello");
		
		for(String str : set)
		{
			System.out.println(str);
		}
	}

}
