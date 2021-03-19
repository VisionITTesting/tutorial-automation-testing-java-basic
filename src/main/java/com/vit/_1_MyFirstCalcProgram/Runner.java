package com.vit._1_MyFirstCalcProgram;
public class Runner {

	public static void main(String[] args) {
		int result;
		Calculator calc = new Calculator();
		result = calc.add(3, 5);
		System.out.println("Addition Result : " + result);
		
		result = calc.sub(4, 6);
		System.out.println("Sub Result : " + result);
	
		result = calc.mul(2, 3);
		System.out.println("Multiply Result : " + result);
		
		// Different Version of the Class
		System.out.println("-----------------------------------");
		CalculatorUsingConstructor calcAdd = new CalculatorUsingConstructor(2,5);
		calcAdd.add();
		calcAdd.printResult();
		
		CalculatorUsingConstructor calcSub = new CalculatorUsingConstructor(4,5);
		calcSub.sub();
		calcSub.printResult();
		
		CalculatorUsingConstructor calcMult = new CalculatorUsingConstructor(6,7);
		calcMult.mul();
		calcMult.printResult();
	}

}
/* OUTPUT
I am called.
Addition Result : 8
Sub Result : -2
Multiply Result : 6
-----------------------------------
Result is: 7
Result is: -1
Result is: 42
*/