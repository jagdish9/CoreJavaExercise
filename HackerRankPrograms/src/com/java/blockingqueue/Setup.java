package com.java.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(20);
	     Producer p = new Producer(q);
	     Consumer c1 = new Consumer(q);
	     Consumer c2 = new Consumer(q);
	     new Thread(p).start();
	     new Thread(c1).start();
	     new Thread(c2).start();
	}

}
