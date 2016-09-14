package com.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest2 {

	 public static void main(String[] args)
	 {
	        ExecutorService tpes =
	            Executors.newCachedThreadPool();
	        CallableWorkerThread workers[] = 
	            new CallableWorkerThread[4];
	        Future futures[] = new Future[4];
	        
	        for (int i = 0; i < 4; i++) 
	        {
	            workers[i] = new CallableWorkerThread(i);
	            futures[i]= tpes.submit(workers[i]);
	        }
	        
	        for (int i = 0; i < 4; i++)
	        {
	            try 
	            {
	                System.out.println("Ending worker: " +
	                    futures[i].get());
	            } 
	            catch (Exception e)
	            {
	            	e.printStackTrace();
	            }
	        }
	        
	        tpes.shutdown();
	    }
}
