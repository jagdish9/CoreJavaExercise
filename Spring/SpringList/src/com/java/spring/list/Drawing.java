package com.java.spring.list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle trangle = (Triangle)factory.getBean("triangle-alias");
		trangle.draw();
	}

}
