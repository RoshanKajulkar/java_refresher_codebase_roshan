package com.java;

public class Calculator {
	void divide(int num1, int num2) {
		System.out.println("\tBegin divide()");
		
//		if(num2 != 0) {
//			int div = num1/ num2;
//			System.out.println("\tDivision of "+ num1 + " by " + num2 + " is :" + div);
//		}
//		else {
//			System.out.println("\tCannot divide "+ num1 + " by " + num2 );
//		}
//		
		try {
			int div = num1/ num2;
			System.out.println("\tDivision of "+ num1 + " by " + num2 + " is :" + div);
		}
		catch(ArithmeticException e) {
			System.out.println("\tDivide by zero exception");
		}
		
		System.out.println("\tEnd divide()\n---------------------");
	}
}
