package com.caseih;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Sergey";
		person1.age = 24;
		int ears1 = person1.calculateEars();
		System.out.println("To retirement " + ears1 + " years");
	}

}

class Person {
	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name + ", I am " + age + " years old");
	}

	void sayHello() {
		System.out.println("Hello!");
	}

	int calculateEars() {
		sayHello();
		speak();
		int ears = 65 - age;
		return ears;
	}

}