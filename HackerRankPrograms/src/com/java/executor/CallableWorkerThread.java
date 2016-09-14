package com.java.executor;

import java.util.concurrent.Callable;

public class CallableWorkerThread implements Callable<Integer> {

	private int workerNumber;
	
	CallableWorkerThread(int number)
	{
		workerNumber = number;
	}
	
	public Integer call()
	{
		for (int i = 0; i <= 100; i += 20)
		{
            
            System.out.println("Worker number: " + workerNumber
                + ", percent complete: " + i +" Completed by "+Thread.currentThread().getName());
            try 
            {
                Thread.sleep((int)(Math.random() * 1000));
            } 
            catch (InterruptedException e)
            {
            	e.printStackTrace();
            }
        }
        return(workerNumber);
	}
}
