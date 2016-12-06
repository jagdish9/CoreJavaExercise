package com.spring.eventHandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape)context.getBean("circle"); // coding to interface because triangle and circle class implements shape interface
		shape.draw(); 
	}

}
