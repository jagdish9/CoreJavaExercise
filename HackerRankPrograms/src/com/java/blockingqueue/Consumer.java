package com.java.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue<Integer> queue;
	   Consumer(BlockingQueue<Integer> q) 
	   {
		   queue = q; 
	   }
	   public void run() {
	     try {
	       while (true) 
	       { 
	    	   consume(queue.take()); 
	       }
	     } catch (InterruptedException ex) 
	     { 
	    	 ex.printStackTrace();
	     }
	   }
	  private void consume(int value) 
	  {
		System.out.println(value);  
	  }
	   
}
