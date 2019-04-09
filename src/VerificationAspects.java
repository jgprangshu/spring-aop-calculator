package com.capgemini.spring.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
public class VerificationAspects{

	@Around("execution (* com.capgemini.spring.calculator.Calculator.addTwoNumbers(..))")
	public void addAspect(ProceedingJoinPoint pjp)throws Throwable{
		Object args[]= pjp.getArgs();

		int num1 = Integer.parseInt(args[0].toString());
		int num2 = Integer.parseInt(args[1].toString());

		if(num1>0 && num2>0){
			pjp.proceed();		
		}
		else
		System.out.println("The numbers shoulds be positive");	
	}

	
	@After("execution (* com.capgemini.spring.calculator.Calculator.addTwoNumbers(..))") 
	public void addLog() throws Throwable
	{
		System.out.println("addition completed");	
	}


	@Around("execution (* com.capgemini.spring.calculator.Calculator.divideTwoNumbers(..))")
	public void divideAspect(ProceedingJoinPoint pjp) throws Throwable{

		Object args[]= pjp.getArgs();
		double num2 = Double.parseDouble(args[1].toString());

		if(num2!=0){
			pjp.proceed();		
		}
		else
		System.out.println("The denominator cannot be zero");	
	}

	@AfterReturning(pointcut = "execution (* com.capgemini.spring.calculator.Calculator.multiply(..))",returning="mul")
	public void multiplyLog(double mul) throws Throwable
	{
		 
		System.out.println("The result of multiplication is " +mul);	
	}


	@Before("execution (* com.capgemini.spring.calculator.Calculator.subtract(..))")
	public void subtractLog() throws Throwable
	{
		System.out.println("do subtraction");	
	}

	

}