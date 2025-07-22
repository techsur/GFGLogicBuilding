package com.gfg.logicbuilding;

import java.util.Scanner;

public class TestPrime {

	public static boolean checkPrime(int n) {

		if (n <= 0)
			return false;

		for (int i = 2; i < n; i++)

			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter any number to test Prime Number");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Entered number is " + n);

		System.out.println(checkPrime(n));

		sc.close();
	}

}
