package com.caseih;

public class Test {

	public static void main(String[] args) {
		Human human = new Human("Bob",26);
	}

}

class Human {
	private String name;
	private int age;
	
	public Human() {
		System.out.println("Hello from first constructor");
		this.name = "Defaul name";
		this.age = 18;
	}
	
	public Human(String name) {
		this.name = name;
		System.out.println("Name is " + name);
		System.out.println("Hello from second constructor");
	}
	
	public Human(String name, int age) {
		System.out.println("Hello from third constructor");
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
