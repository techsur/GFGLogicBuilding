package com.gfg.logicbuilding;

public class FactorialFind {

	public static int factorialFinding(int n) throws IllegalArgumentException {

		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}

		int result = 1;
		for (int i = 2; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {

		int n = 11;

		try {
			int result = factorialFinding(n);
			System.out.println("Factorial " + result);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
