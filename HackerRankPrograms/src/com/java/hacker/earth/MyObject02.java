package com.java.hacker.earth;

class MyObjectTest {

	public static synchronized void doSomething()
	{
		//
	}
}

public class MyObject02
{
	public static void main(String[] args) throws InterruptedException
	{
		synchronized(MyObjectTest.class)
		{
			while(true)
			{
				Thread.sleep(Integer.MAX_VALUE);
			}
		}
	}
}
