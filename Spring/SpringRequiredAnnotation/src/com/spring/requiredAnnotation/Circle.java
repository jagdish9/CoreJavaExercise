package com.spring.requiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;


	public Point getCenter() {
		return center;
	}

    @Required
	public void setCenter(Point center) {
		this.center = center;
	}


	public void draw()
	{
		System.out.println("Circle drawing");
		System.out.println("Point C = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}
	
}
