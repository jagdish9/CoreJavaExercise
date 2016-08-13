package com.java.thread;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunicationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Queue sharedQ = new LinkedList();

		Thread producer = new Producer(sharedQ);
		Thread consumer = new Consumer(sharedQ);

		producer.start();
		consumer.start();
	}

}
