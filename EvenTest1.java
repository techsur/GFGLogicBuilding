package com.gfg.logicbuilding;

public class EvenTest1 {

	public boolean checkEven(int n) {

		int rem = n % 2;
		if (rem == 0) {
			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {
		int n = 13;

		EvenTest1 ev1 = new EvenTest1();

		if (ev1.checkEven(n) == true) {
			System.out.println("Even Number");
		} else {
			System.out.println("Not Even");
		}

	}
}
