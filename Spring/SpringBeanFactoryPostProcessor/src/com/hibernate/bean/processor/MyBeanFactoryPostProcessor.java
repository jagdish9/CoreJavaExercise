package com.hibernate.bean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		System.out.println("My Bean Factory post proceesor is called");
		
	}

}
