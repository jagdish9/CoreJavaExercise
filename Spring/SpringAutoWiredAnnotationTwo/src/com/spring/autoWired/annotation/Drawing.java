package com.spring.autoWired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape)context.getBean("circle"); // coding to interface because triangle and circle class implements shape interface
		shape.draw(); 
	}

}
