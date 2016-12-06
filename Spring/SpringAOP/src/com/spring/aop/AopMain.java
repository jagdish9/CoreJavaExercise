package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.serivce.ShapeService;

public class AopMain {

	public static void main(String[] args) {

     ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
     ShapeService shapeService = (ShapeService) ctx.getBean("shapeService", ShapeService.class);
     System.out.println(shapeService.getCircle().getName());
	}

}
