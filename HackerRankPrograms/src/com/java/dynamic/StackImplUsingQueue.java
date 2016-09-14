package com.java.dynamic;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsingQueue {

	private static void pop(Queue<String> q, Queue<String> q1)
	{
		String top = "";
		while(q.size() > 1)
		{
			top = q.remove();
			q1.add(top);
		}
		System.out.print(q.remove()+" ");
		Queue<String> temp = q;
		q = q1;
		q1 = temp;
		if(!q.isEmpty())
		{
		 pop(q,q1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new LinkedList<String>();
		q.add("BC");
		q.add("AD");
		q.add("Hello");
		q.add("india");
		q.add("GM");
		
		Queue<String> q1 = new LinkedList<String>();
		pop(q, q1);
	}

}
