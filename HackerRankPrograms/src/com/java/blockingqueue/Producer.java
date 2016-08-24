package com.java.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> queue;
	   Producer(BlockingQueue<Integer> q)
	   { 
		   queue = q; 
	   }
	   public void run()
	   {
	     try {
	       while (true)
	       { 
	    	   queue.put(produce()); 
	       }
	     } 
	     catch (InterruptedException ex) 
	     { 
	    	 ex.printStackTrace();
	     }
	   }
	 private int produce() 
	 {
		 queue.add(45);
		 queue.add(23);
		 queue.add(85);
		 queue.add(34);
		 queue.add(54);
		 queue.add(30);
		 
		 int hd = queue.poll();
		 return hd;
		 
	 }
}
