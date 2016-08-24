package com.java.hacker.earth;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool01 {

	public static void main(String[] args)
	{
		ExecutorService esv = Executors.newFixedThreadPool(5);
		ExecutorService esv1 = Executors.newCachedThreadPool();
		ExecutorService esv2 = Executors.newSingleThreadExecutor();
	}
}
