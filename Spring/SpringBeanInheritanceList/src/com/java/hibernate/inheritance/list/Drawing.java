package com.java.hibernate.inheritance.list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle trangle = (Triangle)factory.getBean("triangle1");
		trangle.draw();
	}

}
