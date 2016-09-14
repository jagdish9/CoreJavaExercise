package com.java.service.executor;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		long waitTime = 600;
		for(int i = 0; i < 10; i++)
		{
			String name = "NamePrinter: "+i;
			int time = random.nextInt();
			waitTime += time;
			Runnable runner = new PrintTask(name, time);
			System.out.println("Adding "+name+" / "+time);
			executor.execute(runner);
		}
		
		//long waitTime = 600;
		
		try
		{
			Thread.sleep(waitTime);
			executor.shutdown();
			executor.awaitTermination(waitTime, TimeUnit.MILLISECONDS);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		System.exit(0);
	}

}
