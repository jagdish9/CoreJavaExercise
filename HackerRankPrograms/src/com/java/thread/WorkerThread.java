package com.java.thread;

public class WorkerThread implements Runnable {

	private String command;
	
	public WorkerThread(String s)
	{
		command = s;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
		processCommand();
		System.out.println(Thread.currentThread().getName()+" End.");
	}
	
	private void processCommand()
	{
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	public String toString()
	{
		return this.command;
	}
}
