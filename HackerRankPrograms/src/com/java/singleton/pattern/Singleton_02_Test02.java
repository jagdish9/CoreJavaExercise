package com.java.singleton.pattern;

public class Singleton_02_Test02 {

private static Singleton_02_Test02 instance = null;
	
	private Singleton_02_Test02()
	{
		
	}
	
	public static Singleton_02_Test02 getInstance()
	{
		if(instance == null)
		{
			synchronized(Singleton_02_Test02.class)
			{
				if(instance == null)
				{
			      instance = new Singleton_02_Test02();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve()
	{
		return instance;
	}
}
