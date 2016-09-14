package com.java.blockingQimplen;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
		
		Thread prodThread = new Thread(new Producer(sharedQueue));
		Thread consThread = new Thread(new Consumer(sharedQueue));
		
		prodThread.start();
		consThread.start();
	}

}
