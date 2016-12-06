package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Triangle trangle = new Triangle();
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle trangle = (Triangle)factory.getBean("triangle-alias");
		trangle.draw();
	}

}
