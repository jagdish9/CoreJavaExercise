package com.spring.component.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component // by-default Circle name is circle treated as bean which is not defined in spring.xml
//@Service // same as above
@Controller // same as above
public class Circle implements Shape{

	private Point center;

	public Point getCenter() {
		return center;
	}
    @Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw()
	{
		System.out.println("Circle drawing");
		System.out.println("Point is = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}
}
