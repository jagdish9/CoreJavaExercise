package com.java.singleton.pattern;

public class SIngleton_01_Test {

	private static SIngleton_01_Test instance = new SIngleton_01_Test();
	
	private SIngleton_01_Test()
	{
		
	}
	
	public static SIngleton_01_Test getInstance()
	{
		return instance;
	}

}
