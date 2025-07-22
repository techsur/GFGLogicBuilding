package com.gfg.logicbuilding;

public class SumOfDigits {

	public static int sumDigits(int n) {

		int sum = 0;
		while (n != 0) {
			int last = n % 10;
			sum = sum+last;
			n= n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int n = 12345;
		System.out.println("Given number is " + n);
		System.out.println(sumDigits(n));

	}

}
