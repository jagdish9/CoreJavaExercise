package com.spring.jsrAnnotations;

import javax.annotation.*;

public class Circle implements Shape {

	private Point center;


	public Point getCenter() {
		return center;
	}
	//@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
/*
 *@Resource by-default it goes to center name in spring.xml
*/

	//@PostConstruct // to call before initialization
	public void initializeCircle()
	{
		System.out.println("Init of Circle");
	}
	
	//@PreDestroy // to call after initialization
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle");
	}
	
	public void draw()
	{
		System.out.println("Circle drawing");
		System.out.println("Point C = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}
	
}
