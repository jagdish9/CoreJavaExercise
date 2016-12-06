package com.spring.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In After initializing method. Bean name is: "+beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In Before initializing method. Bean name is: "+beanName);
		return bean;
	}

}
