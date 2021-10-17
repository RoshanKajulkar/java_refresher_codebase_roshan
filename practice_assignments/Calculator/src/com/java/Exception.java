package com.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Calculator myCalc = new Calculator();
		myCalc.divide(20, 10);
		myCalc.divide(33, 10);
		myCalc.divide(257, 256);
		myCalc.divide(257, 0);
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			myCalc.divide(num1, num2);
		}catch(InputMismatchException e) {
			System.out.println("Incorrect data entered!");
		}
		
		System.out.println("Main End");	
	}
}