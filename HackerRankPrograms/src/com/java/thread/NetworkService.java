package com.java.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NetworkService implements Runnable {

	private final ServerSocket serversocket;
	private final ExecutorService pool;
	
	public NetworkService(int port, int poolsize) throws IOException
	{
		serversocket = new ServerSocket(port);
		pool =  Executors.newFixedThreadPool(poolsize);
	}
	
	public void run()
	{
	   try
	   {
		   for(;;)
		   {
			   pool.execute(new Handler(serversocket.accept()));
		   }
	   }
	   catch(IOException io)
	   {
		   pool.shutdown();
	   }
	}
	
	public void shutdownAndAwaitTermination(ExecutorService pool)
	{
		pool.shutdown();
		
		try
		{
			if(!pool.awaitTermination(60, TimeUnit.SECONDS))
			{
				pool.shutdownNow();
			}
			if(!pool.awaitTermination(60, TimeUnit.SECONDS))
			{
				System.err.println("Pool did not terminate");
			}
		}
		catch(InterruptedException ie)
		{
			pool.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}
}

class Handler implements Runnable
{
	private final Socket socket;
	
	public Handler(Socket socket)
	{
		this.socket = socket;
	}
	public void run()
	{
		// read and service request on socket
	}
	
}