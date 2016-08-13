package com.java.collection;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(20);
		q1.add(30);
		q1.add(10);
		q1.add(50);
		q1.add(40);

		Iterator<Integer> iterator = q1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		System.out.println("Head of the Queue: " + q1.element());

		System.out.println("Element inserted: " + q1.offer(100));

		System.out.println("Head of the queue: " + q1.peek());

		System.out.println("Head element retrieved and removed: " + q1.poll());

		System.out.println("After Head removed");
		Iterator<Integer> iterator1 = q1.iterator();
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}

		System.out.println();

		System.out
				.println("Head element retrieved and removed: " + q1.remove());

		System.out.println("After Head removed");
		Iterator<Integer> iterator2 = q1.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}

	}

}
