package com.spring.autoWiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {

	private Point center;


	public Point getCenter() {
		return center;
	}
    @Autowired
	public void setCenter(Point center) {
		this.center = center;
	}
/*
 * @Autowired annotation => it is look with type after that it will look with name, if there are
 * more beans and not able to identify then it will look with @Qualifier annotation, if does not match
 * then it will throw the error, here it is type is Point and name is center
*/

	public void draw()
	{
		System.out.println("Circle drawing");
		System.out.println("Point C = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}
	
}
