package com.java.callbacks.withbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle trangle = (Triangle)context.getBean("triangle");
		trangle.draw();
	}

}
