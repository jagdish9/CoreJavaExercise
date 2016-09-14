package com.java.blockingQimplen;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {

	private final BlockingQueue<Integer>  sharedQueue;
	
	public Consumer(BlockingQueue<Integer> sharedQueue)
	{
		this.sharedQueue = sharedQueue;
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Consumed: "+sharedQueue.take());
			}
			catch(InterruptedException ie)
			{
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ie);
			}
		}
	}
}
