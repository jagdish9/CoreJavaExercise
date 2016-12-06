package com.java.singleton.pattern;

public class OldSingleton {

	private static OldSingleton instance = null;
	
	private OldSingleton()
	{
		
	}
	
	public static OldSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new OldSingleton();
		}
		return instance;
	}
}
