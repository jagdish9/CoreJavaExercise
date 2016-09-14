package com.java.database.practise;

public class Employee {

	private int empid;
	private String empname;
	private int deptno;
	
	public Employee(int empid, String empname, int deptno)
	{
		this.empid = empid;
		this.empname = empname;
		this.deptno = deptno;
	}
	
	public int getId()
	{
		return empid;
	}
	
	public String getEmpName()
	{
		return empname;
	}
	
	public int getDeptNo()
	{
		return deptno;
	}
}
