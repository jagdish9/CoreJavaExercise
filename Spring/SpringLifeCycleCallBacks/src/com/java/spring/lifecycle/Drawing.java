package com.java.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle trangle = (Triangle)context.getBean("triangle1");
		trangle.draw();
		
	}

}
