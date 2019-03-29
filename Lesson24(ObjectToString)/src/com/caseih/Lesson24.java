package com.caseih;

public class Lesson24 {

	public static void main(String[] args) {
		Human human = new Human("Jon",25);
		System.out.println(human);
		System.out.println(human.hashCode());
		System.out.println(human.toString());
	}

}
class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "," + age ;
		
	}
	
}
