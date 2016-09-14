package com.java.dynamic;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Queue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new LinkedList<String>();
		q.add("BC");
		q.add("AD");
		q.add("Hello");
		q.add("india");
		q.add("GM");
		
		Iterator<String> it = q.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
