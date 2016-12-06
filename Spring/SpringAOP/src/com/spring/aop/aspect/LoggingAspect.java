package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters() && allCircleMthodas2()")  // combine method level and class level pointcuts
	//@Before("allGetters()") 
	//@Before("execution(* get*())") // this the point cut for loggingAdvice method
	//@Before("execution(public * get*(..))") // it can be for arguments or no arguments
	//@Before("execution(* get*(*))") // with one or more arguments
	//@Before("execution(* get*())")
	//@Before("execution(public * get*())") 
	//@Before("execution(public String getName())") 
	//@Before("execution(public String com.spring.aop.model.Circle.getName())") // this method is executed before execution of getName() method like trigger in database
	public void loggingAdvice()
	{
		System.out.println("Advice run. Get method callled");
	}
	
	@Before("allGetters()") 
	//@Before("execution(* get*())") 
	public void secondAdvice()
	{
		System.out.println("Second advice executed");
	}
	
	@Pointcut("execution(* get*())") // method level point cut expression
	public void allGetters(){}
	/*@pointcut is used to reference all methods like here it is two advice methods are there
	we are specifying each pointcut to each methods, in these scenario pointcut is used*/
	
	@Pointcut("execution(* com.spring.aop.model.Circle.*(..))")
	public void allCircleMthodas(){}
	
	// within=> class level expression
	//@Pointcut("within(com.spring.aop.model..*)") // pointcut will apply all the classes as well as subpackage of model package
	//@Pointcut("within(com.spring.aop.model.*)") // pointcut will apply all classes of model package
	@Pointcut("within(com.spring.aop.model.Circle)") // all methods of any class
	public void allCircleMthodas2(){}
	
	//@Pointcut(args())
	
}
