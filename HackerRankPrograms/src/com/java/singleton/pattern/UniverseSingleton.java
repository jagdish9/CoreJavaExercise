package com.java.singleton.pattern;

public final class UniverseSingleton {

	public static UniverseSingleton getInstance()
	{
		return fINSTANCE;
	}
	
	private static UniverseSingleton fINSTANCE = new UniverseSingleton();
	
	private UniverseSingleton()
	{
		
	}
}
