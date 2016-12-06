package com.spring.aop.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circles's setter called");
		//throw(new RuntimeException()); // it is added to check that @AfterReturning is correctly working or not
	}
	
	public String setNameandReturns(String name) {
		this.name = name;
		System.out.println("Circles's setNameandReturns called");
		return name;
	}
}
