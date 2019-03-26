package com.caseih;

public class Test {

	public static void main(String[] args) {
		Human human = new Human();
		human.setName("Jon");
		human.setAge(45);
		human.getInfo();

	}

}

class Human {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void getInfo() {
		System.out.println(name + ", " + age);
	}
}
