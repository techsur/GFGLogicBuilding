package com.gfg.logicbuilding;

public class SumOfDigits2 {

	public static int sumDigits(int n) {

		String s = Integer.toString(n);
		int sum = 0;

		for (char ch : s.toCharArray()) {
			sum += ch - '0';
		}

		return sum;
	}

	public static void main(String[] args) {

		int n = 123456;
		System.out.println(sumDigits(n));

	}
}
