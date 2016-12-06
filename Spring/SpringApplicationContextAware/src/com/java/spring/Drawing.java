package com.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); // initialze only once
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
	}

}
