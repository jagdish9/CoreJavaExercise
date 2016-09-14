package com.java.threadpool;

public class Task implements Runnable{

	private String name;
	
	public Task(String name)
	{
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
			long duration = (long) (Math.random()*10);
			System.out.println("Doing a task during: "+name);
			Thread.sleep(duration);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
