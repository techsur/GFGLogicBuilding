package com.gfg.logicbuilding;

public class OddTest {

	public static boolean checkOdd(int n) {

		int rem = n % 2;

		if (rem != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n = 12;

		if (checkOdd(n) == true) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
	}

}
