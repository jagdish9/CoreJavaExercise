package com.java.pooling;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<String> sharedQueue;
	private String name;
	
	public Producer(BlockingQueue<String> sharedQueue, String name)
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
		try
		{
		/*  synchronized(sharedQueue)
		   { */
			for(int i = 1; i<= 10; i++)
			{
				System.out.println("Produced by: "+this.getName()+" Produced item: Task_"+i);
				sharedQueue.put("Task_"+i);
			}
		   //}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
