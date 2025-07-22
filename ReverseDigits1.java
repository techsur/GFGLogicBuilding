package com.gfg.logicbuilding;

public class ReverseDigits1 {

	public static int revDigit(int n) {

		StringBuffer sb = new StringBuffer(String.valueOf(n));

		sb.reverse();
		n = Integer.parseInt(String.valueOf(sb));

		return n;
	}

	public static void main(String[] args) {
		int n = 12345;

		System.out.println(revDigit(n));

	}

}
