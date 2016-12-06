package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.FactoryService;
import com.spring.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
	/*	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	     ShapeService shapeService = (ShapeService) ctx.getBean("shapeService", ShapeService.class);
	     shapeService.getCircle().setName("Dummy Name");*/
	    // shapeService.getCircle().setNameandReturns("Dummy Name");
	    //System.out.println(shapeService.getCircle().getName());
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
	     shapeService.getCircle(); 
	     
     /*this project is to define how AOP before and after is working behind the scene*/
	}

}
