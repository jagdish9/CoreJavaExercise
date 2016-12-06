package com.java.onmobile;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> newSet =
				new ArrayList<String>(Arrays.asList("Java", "COBOL2", "python3", "ruby"));
		newFilter(newSet);
		System.out.println(newSet);
		
	}
	
	private static void newFilter(ArrayList<String> ls)
	{
		for(Object str : ls.toArray())
		{
			for(char c : ((String) str).toCharArray())
			{
				if(Character.isDigit(c))
				{
					((String) str).replace(c, 'Z');
				}
			}
		}
	}
}
