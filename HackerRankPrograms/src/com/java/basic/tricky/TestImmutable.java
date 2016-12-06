package com.java.basic.tricky;

public final class TestImmutable {

	private final String name;
	private final String Address;
	
	public TestImmutable(String name, String Address)
	{
		this.name = name;
		this.Address = Address;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddres()
	{
		return Address;
	}
}
