package com.java.singleton.pattern;

public class OldSingletonWithThreadSafe {

	private static OldSingletonWithThreadSafe instance = null;
	
	private OldSingletonWithThreadSafe()
	{
		
	}
	
	public static synchronized OldSingletonWithThreadSafe getInstance()
	{
		if(instance == null)
		{
			instance = new OldSingletonWithThreadSafe();
		}
		return instance;
	}
}
