package com.java.hacker.earth;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(5);
		pq.add(1);
		pq.add(10);
		pq.add(40);
		pq.add(9);
		pq.add(7);

		Arrays.sort(pq.toArray());

		Iterator<Integer> iterator = pq.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
