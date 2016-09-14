package com.java.producer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable{

	private final Vector<Integer> sharedQueue;
	private final int size;
	
	public Producer(Vector<Integer> sharedQueue, int size)
	{
	  	this.sharedQueue = sharedQueue;
	  	this.size = size;
	}
	
	public void run()
	{
		for(int i = 1; i < 7; i++)
		{
			System.out.println("Produced: "+i);
			try
			{
				produce(i);
			}
			catch(InterruptedException ie)
			{
				//ie.printStackTrace();
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ie);
			}
		}
	}
	
	public void produce(int i) throws InterruptedException
	{
		// wait if queue is full
		while(sharedQueue.size() == size)
		{
			synchronized(sharedQueue)
			{
				System.out.println("Queue is full "+Thread.currentThread().getName()
						+" is waiting, size: "+sharedQueue.size());
				sharedQueue.wait();
			}
		}
		
		// producing elements and notify consumers
		synchronized(sharedQueue)
		{
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
	}
	
	
}
