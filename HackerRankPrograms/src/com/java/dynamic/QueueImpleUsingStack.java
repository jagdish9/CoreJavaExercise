package com.java.dynamic;

import java.util.Iterator;
import java.util.Stack;

public class QueueImpleUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s1 = new Stack<String>();
		s1.add("BC");
		s1.add("AD");
		s1.add("Hello");
		s1.add("india");
		s1.add("GM");
		
		Stack<String> s2 = new Stack<String>();
		
		Iterator<String> it1 = s1.iterator();
		while(it1.hasNext())
		{
			s2.add(it1.next());
		}
		s1.clear();
		Iterator<String> it2 = s2.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next()+" ");
		}
	}

}
