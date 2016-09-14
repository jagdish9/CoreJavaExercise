package com.java.hashmap.implementation;

public class Employee {

	private int id;
	private String name;
	private String designation;
	private int yearsOfExperience;
	
	public Employee(int id, String name, String designation, int yearsOfExperience)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getNames()
	{
		return name;
	}
	
	public String getDesignation()
	{
		return designation;
	}
	
	public int getYearsOfExperience()
	{
		return yearsOfExperience;
	}
}
