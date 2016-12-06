package com.java.singleton.pattern;

import java.io.Serializable;

public class UniverseSingletonWithSerialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final UniverseSingletonWithSerialization instance
	= new UniverseSingletonWithSerialization();
	
	private UniverseSingletonWithSerialization()
	{
		
	}
	
	public static UniverseSingletonWithSerialization getInstance()
	{
		return instance;
	}
	
	private Object readResolve()
	{
		return instance;
	}
}
