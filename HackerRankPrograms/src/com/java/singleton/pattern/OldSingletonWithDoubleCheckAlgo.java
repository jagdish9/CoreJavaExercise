package com.java.singleton.pattern;

public class OldSingletonWithDoubleCheckAlgo {

	private static OldSingletonWithDoubleCheckAlgo instance = null;
	
	private OldSingletonWithDoubleCheckAlgo()
	{
		
	}
	
	public static OldSingletonWithDoubleCheckAlgo getInstance()
	{
		if(instance == null)
		{
			synchronized(OldSingletonWithDoubleCheckAlgo.class)
			{
				if(instance == null)
				{
					instance = new OldSingletonWithDoubleCheckAlgo();
				}
			}
		}
		return instance;
	}
}
