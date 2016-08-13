package com.java.thread;

import java.util.Queue;

public class Consumer extends Thread {

	// private static final Logger logger = Logger.getLogger(Consumer.class);
	private final Queue sharedQ;

	public Consumer(Queue sharedQ) {
		super("Consumer");
		this.sharedQ = sharedQ;
	}

	@Override
	public void run() {
		while (true) {

			synchronized (sharedQ) {
				// waiting condition - wait until Queue is not empty
				while (sharedQ.size() == 0) {
					try {
						// logger.debug("Queue is empty, waiting");
						sharedQ.wait();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				int number = (Integer) sharedQ.poll();
				// logger.debug("consuming : " + number );
				sharedQ.notify();

				// termination condition
				if (number == 3) {
					break;
				}
			}
		}
	}
}