package com.gfg.logicbuilding;

public class EvenTest {
//With static method
	public static boolean checkEven(int n) {
		int rem = n % 2;
		if (rem == 0) {
			return true;
		} else

			return false;

	}

	public static void main(String[] args) {

		int n = 10;

		if (checkEven(n) == true) {
			System.out.println("Even number");
		} else {
			System.out.println("Not Even");
		}
	}
}
