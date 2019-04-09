package com.capgemini.spring.main;


import com.capgemini.spring.calculator.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = context.getBean(Calculator.class);
		calculator.addTwoNumbers(10,20);
		calculator.divideTwoNumbers(8.0,2.0);
		calculator.subtract(80,40);
		calculator.multiply(42,2);
	}



}