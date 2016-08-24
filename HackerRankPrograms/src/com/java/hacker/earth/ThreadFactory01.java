package com.java.hacker.earth;

import java.util.concurrent.ThreadFactory;

public class ThreadFactory01 implements ThreadFactory {

	public Thread newThread(Runnable r)
	{
		return new Thread(r);
	}

}
