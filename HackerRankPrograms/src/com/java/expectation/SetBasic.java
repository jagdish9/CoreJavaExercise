package com.java.expectation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> _set = new HashSet<Integer>();
		_set.add(11);
		_set.add(12);
		_set.add(13);
		_set.add(14);
		_set.add(15);
		
		Iterator<Integer> _it = _set.iterator();
		while(_it.hasNext())
		{
			System.out.println(_it.next());
		}
	}

}
