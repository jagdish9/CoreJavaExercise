package com.java.basic.tricky;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> sk = new Stack<Integer>();
		sk.add(42);
		sk.add(20);
		sk.add(79);
		sk.add(19);
		sk.add(9);
		
		List<Integer> ls = new LinkedList<Integer>(sk);
		Collections.sort(ls);
		
		System.out.println(sk);
		System.out.println(ls);
	}

}
