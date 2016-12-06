package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.spring.aop.model.Circle;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoints)
	{
		System.out.println(joinPoints.toString());
		System.out.println(joinPoints.getTarget());
		
		Circle circle = (Circle)joinPoints.getTarget();
		System.out.println(circle.getName());
		//System.out.println("Advice run. Get method callled");
	}
	
	@Before("args(name)")
	//@Before("args(String)") // executed before calling set method
	public void stringArgumentMethods(String name){
		System.out.println("A method that takes string argument has been called. The value is "+name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	@Pointcut("within(com.spring.aop.model.Circle)")
	public void allCircleMethods(){}
}
