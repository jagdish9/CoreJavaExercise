package com.java.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService exs = Executors.newFixedThreadPool(2);
		WorkerThread[] wt = new WorkerThread[4];
		
		for (int i = 0; i < wt.length; i++) 
		{
            wt[i] = new WorkerThread(i);
            exs.execute(wt[i]);
        }
		
		exs.shutdown();
	}

}
