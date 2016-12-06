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

//@Aspect
public class LoggingAspect {

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
	
	/*@Pointcut("execution(* get*())")
	public void allGetters(){}*/
	
	public void loggingAdvice()
	{
		System.out.println("Logging from the advice");
	}
}
