package com.spring.eventHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component // by-default Circle name is circle treated as bean which is not defined in spring.xml
public class Circle implements Shape, ApplicationEventPublisherAware{

	private Point center;

	private ApplicationEventPublisher publisher;
	
	public ApplicationEventPublisher getPublisher() {
		return publisher;
	}
	public void setPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
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
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	// below is the method of ApplicationEventPublisher interface which we have implemented in this class
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
