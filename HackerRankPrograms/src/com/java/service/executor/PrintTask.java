package com.java.service.executor;

public class PrintTask implements Runnable {

	private final String name;
	private final int delay;
	
	public PrintTask(String name, int delay)
	{
	  this.name = name;
	  this.delay = delay;
	}
	
	public void run()
	{
		System.out.println("Starting: "+name+" -"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(delay);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("Done with: "+name);
	}
}
