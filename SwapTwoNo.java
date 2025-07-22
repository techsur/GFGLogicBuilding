package com.gfg.logicbuilding;

public class SwapTwoNo {

	public static void main(String[] args) {

		int a = 2, b = 3;

		System.out.println("Given two numbers are " + a + " and " + b);

		a = a + b;
		System.out.println("Value of a now: " + a);
		b = a - b;
		System.out.println("Value of a now: " + b);
		a = a - b;
		System.out.println("Value of a now: " + a);
		
		System.out.println("After swap given two numbers are " + a + " and " + b);
	}

}
