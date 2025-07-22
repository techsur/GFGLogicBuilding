package com.gfg.logicbuilding;

public class PalindromeCheck {

	public static boolean palindromeNo(int n) {
		if (n == 0) {
			throw new IllegalArgumentException("Enter right number");
		}

		int originalNumber = n;
		int rev = 0;

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}

		return originalNumber == rev;

	}

	public static void main(String[] args) {

		int n = 12321;

		try {
			boolean result = palindromeNo(n);
			if (result) {
				System.out.println(n + " is a Palindrome");
			} else {
				System.out.println(n + " is not a Palindrome");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}