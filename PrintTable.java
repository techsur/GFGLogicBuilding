package com.gfg.logicbuilding;

public class PrintTable {

	public static void printTab(int n) {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Table of "+n+" is = "+n+"*"+i+"="+n*i);
		}
	}

	public static void main(String[] args) {
		int n = 8;
		printTab(n);

	}
}
