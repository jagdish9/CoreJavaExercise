package com.java.pooling;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BlockingQueue<String> sharedQueue = new LinkedBlockingQueue<String>();
		
		Thread prodThread1 = new Thread(new Producer(sharedQueue, "Producer1"));
		Thread prodThread2 = new Thread(new Producer(sharedQueue, "Producer2"));
		Thread consThread1 = new Thread(new Consumer(sharedQueue, "Consumer1"));
		Thread consThread2 = new Thread(new Consumer(sharedQueue, "Consumer2"));
		
		prodThread1.start();
		prodThread2.start();
		//prodThread2.join();
		consThread1.start();
		//consThread2.start();
	}

}
