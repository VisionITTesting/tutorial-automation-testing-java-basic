package com.vit._2_MyAdvancedCalcProgram.operations;

public class Runner {

	public static void main(String[] args) {

		Addition add = new Addition(2,4,5);
		add.addition();

		Subtraction sub = new Subtraction(2,-4,-5);
		sub.subtraction();

		Multiplication multiply = new Multiplication(2,4,5);
		multiply.multiplication();

	}
}
/*
Output:
Result of the Operation: Add is: 11
Result of the Operation: Sub is: -7
Result of the Operation: Multiplication is: 40
 */
