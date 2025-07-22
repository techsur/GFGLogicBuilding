package com.gfg.logicbuilding;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 2, b = 3;

		System.out.println("Numbers taken are " + a + " and " + b);

		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("Numbers after swapping " + a + " and " + b);
	}

}
