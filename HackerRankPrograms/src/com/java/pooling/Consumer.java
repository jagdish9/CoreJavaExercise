package com.java.pooling;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<String> sharedQueue;
	private String name;
	
	public Consumer(BlockingQueue<String> sharedQueue, String name)
	{
		this.sharedQueue = sharedQueue;
		this.name = name;
	}
	
	public String getName()
	{
	  return name;	
	}
	
	public void run()
	{
	 /*  synchronized(sharedQueue)
	   { */
		while(true)
		{
			try
			{
			System.out.println("Consumed by: "+this.name+", item consumed: "+sharedQueue.take());
			
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	  // }
	}
}
