package com.gfg.logicbuilding;

public class TestOdd1 {

	public boolean checkOdd(int n) {

		int rem = n % 2;
		if (rem == 0) {
			return true;
		} else {
			return false;

		}
	}

	public static void main(String[] args) {

		int n = 50;

		TestOdd1 odd = new TestOdd1();

		if (odd.checkOdd(n) == true) {
			System.out.println("Odd");
		} else {
			System.out.println("0dd");
		}
	}

}
