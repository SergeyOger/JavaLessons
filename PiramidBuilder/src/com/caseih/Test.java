package com.caseih;

public class Test {

	public static void main(String[] args) {

		String symbol = "*";
		int numbersOfRows = 10;

		System.out.println("Fisrt piramid");

		for (int i = 1; i <= numbersOfRows; i++) {

			System.out.println(symbol.repeat(i));
		}

		System.out.println();

		System.out.println("Second piramid");

		for (int i = numbersOfRows; i > 0; i--) {

			System.out.println(symbol.repeat(i));
		}

		System.out.println();

	}

}
