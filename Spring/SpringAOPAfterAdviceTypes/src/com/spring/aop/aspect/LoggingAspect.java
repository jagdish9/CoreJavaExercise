package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.spring.aop.model.Circle;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoints){
		
	}
	
	//@After("args(name)") // it will get executed when method returns fail or pass
	/*@AfterReturning("args(name)") // it will get executed only and only if method returns pass
	public void stringArgumentMethods(String name){
		System.out.println("A method that takes string argument has been called. The value is "+name);
	}*/
	
	@AfterReturning(pointcut="args(name)", returning="returnString") // it will get executed only and only if method returns pass, it will return string and assign into returnString and name properties
	public void stringArgumentMethods(String name, String returnString){
		System.out.println("A method that takes string argument has been called. The value is "+name+". The output value is "+returnString);
	}
	
	/*@AfterThrowing("args(name)") // it gets excecuted when method throws any error
	public void exceptionAdvice(String name){
		System.out.println("An Exception has been thrown.");
	}*/
	
	@AfterThrowing(pointcut="args(name)", throwing="ex") // it gets excecuted when method throws any error, it returns exception as well
	public void exceptionAdvice(String name, RuntimeException ex){
		System.out.println("An Exception has been thrown "+ex);
	}
	
	@Around("@annotation(com.spring.aop.aspect.Loggable)") // custom annotation
	//@Around("allGetters()") // it executes before and after of execution of target methods
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJointPoint){
		
		Object returnValue = null;
		try {
			System.out.println("Before Advice");
			returnValue = proceedingJointPoint.proceed();
			System.out.println("After Returning");
		} 
		catch (Throwable e) {
			System.out.println("After throwing");
		}
		
		System.out.println("After finally");
		
		return returnValue;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	@Pointcut("within(com.spring.aop.model.Circle)")
	public void allCircleMethods(){}
}
