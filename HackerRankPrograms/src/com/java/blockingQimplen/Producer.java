package com.java.blockingQimplen;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> sharedQueue;
	
	public Producer(BlockingQueue<Integer> sharedQueue)
	{
		this.sharedQueue = sharedQueue;
	}
	
	public void run()
	{
		for(int i = 1; i < 10; i++)
		{
			try
			{
				System.out.println("Produced: "+i);
				sharedQueue.put(i);
			}
			catch(InterruptedException ie)
			{
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ie);
			}
		}
	}
	
}
