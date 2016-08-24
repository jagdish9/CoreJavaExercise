package com.java.hacker.earth;

class MyObject01 {

	public Object lock = new Object();
	
	public void doSomething()
	{
       synchronized(lock)
       {
    	   //
       }
	}
	
	public synchronized void doSome()
	{
		//
	}
}	

public class MyObject
{
	public static void main(String[] args)
	{
		
	 MyObject01 myobj = new MyObject01();
	 myobj.lock = new Object();
	}
}

