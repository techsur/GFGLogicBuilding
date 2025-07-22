package com.gfg.logicbuilding;

public class SumOfNaturalNo {

	public static int sumNaturalNo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 15;

		System.out.println(sumNaturalNo(n));
	}

}
