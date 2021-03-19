package com.vit._1_MyFirstCalcProgram;

public class CalculatorUsingConstructor {
	
	//Variables/Attribute
	int a;
	int b;
	int result;
	
	//Constructor
	public CalculatorUsingConstructor(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//Methods/Behaviours
	public void add() {
		result = a + b;
	}
	
	public void sub() {
		result = a - b;
	}
	
	public void mul() {
		result = a * b;
	}
	
	public void div() {
		result = a / b;
	}

	public void printResult() {
		System.out.println("Result is: " + result);
	}
}