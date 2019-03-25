package com.caseih;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //System.in входной поток данных
		System.out.println("Insert 2 something numbers: ");
		//String string = s.nextLine(); //nextLine считать одну строчку данных, строчка до момента нажатия enter
		int x  = s.nextInt(); // считывание целочисленной переменной nextInt
		int y  = s.nextInt();
		System.out.println("You insert " + x + " first number " + y + " second number ");
		s.close();
		

	}

}
