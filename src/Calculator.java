package com.capgemini.spring.calculator;
import org.springframework.stereotype.*;

public interface Calculator{

	public void addTwoNumbers(int number1, int number2);
	public void divideTwoNumbers(double number1,double number2);
	public void subtract(Integer num1, Integer num2);
	public double multiply(double num1,double num2);

}

@Service
class CalculatorImpl implements Calculator{

	public void addTwoNumbers(int number1, int number2){
		
		System.out.println("The result of addition is " +(number1+number2));
	}

	public void divideTwoNumbers(double number1, double number2){
		
		System.out.println("The result of division is " +(number1/number2));
	}

	public void subtract(Integer num1, Integer num2)
	{
		System.out.println("The result of substraction is " +(num1-num2));
	}

	public double multiply(double num1,double num2)
	{
		return (num1*num2);
	}

}