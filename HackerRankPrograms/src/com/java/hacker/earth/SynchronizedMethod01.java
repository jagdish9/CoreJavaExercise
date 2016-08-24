package com.java.hacker.earth;

import java.util.Arrays;

public class SynchronizedMethod01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] arr = {"1", "2", "3", "4", "5", "6"};
		
		HashMapProcessor01 hmap = new HashMapProcessor01(arr);
		Thread t1 = new Thread(hmap, "A");
		Thread t2 = new Thread(hmap, "B");
		Thread t3 = new Thread(hmap, "C");
		long start = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();  
		t3.join();
		
		System.out.println("Time Taken: "+(System.currentTimeMillis() - start));
		
		System.out.println(Arrays.asList(hmap.getHashMap()));
	}

}

class HashMapProcessor01 implements Runnable
{
	private String[] strArr = null;
	
	public HashMapProcessor01(String[] strArr) {
		this.strArr = strArr;
	}

	public String[] getHashMap() {
		return strArr;
	}

	public void run() {
        processArr(Thread.currentThread().getName());
	}
	
	public void processArr(String name)
	{
		for(int i = 0; i < strArr.length; i++)
		{
			processSomething(i);
			addThreadName(i, name);
		}
	}
	
	public Object lock = new Object();
	public void addThreadName(int k, String name)
	{
	   synchronized(lock)
	   {
		strArr[k] = strArr[k] + ": "+name;
	   }
	}
	
	public void processSomething(int j)
	{
		try
		{
			Thread.sleep(j*1000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	
}
