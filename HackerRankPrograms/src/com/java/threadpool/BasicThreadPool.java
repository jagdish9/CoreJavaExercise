package com.java.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class BasicThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		for(int i = 1; i <= 5; i++)
		{
			Task task = new Task("Task_"+i);
			System.out.println("A new task has been added "+task.getName());
			tpe.execute(task);
		}
		tpe.shutdown();
	}

}
