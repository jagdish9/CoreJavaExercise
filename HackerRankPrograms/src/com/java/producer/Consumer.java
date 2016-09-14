package com.java.producer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {

	private final Vector<Integer> sharedQueue;
	private final int size;
	
	public Consumer(Vector<Integer> sharedQueue, int size)
	{
		this.sharedQueue = sharedQueue;
		this.size = size;
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Consumed: "+consume());
				Thread.sleep(50);
			}
			catch(InterruptedException ie)
			{
				//ie.printStackTrace();
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ie);
			}
		}
	}
	
	private int consume() throws InterruptedException
	{
		// wait if shared queue is empty
		while(sharedQueue.isEmpty())
		{
			synchronized(sharedQueue)
			{
			 System.out.println("Queue is empty "+Thread.currentThread().getName()+" is waiting, size: "
					+ " "+sharedQueue.size());
			 sharedQueue.wait();
			}
		}
		
		//otherwise consume element and notify waiting producer
		synchronized(sharedQueue)
		{
			sharedQueue.notifyAll();
			return (Integer) sharedQueue.remove(0);
		}
		
	}
}
