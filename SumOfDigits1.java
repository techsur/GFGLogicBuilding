package com.gfg.logicbuilding;

public class SumOfDigits1 {

	public static int sumDigit(int n) {

		int sum = 0;
		if (n == 0) {
			return 0;
		} else
			return (sum + n % 10) + sumDigit(n / 10);

	}

	public static void main(String[] args) {
		int n = 123456;
		System.out.println(sumDigit(n));

	}

}


//Better approach, because it is not using extra variables
/*
 * class GfG { static int sumOfDigits(int n) {
 * 
 * // Base Case if (n == 0) return 0;
 * 
 * // Recursive Case return (n % 10) + sumOfDigits(n / 10); }
 * 
 * public static void main(String[] args) {
 * System.out.println(sumOfDigits(12345)); } }
 */