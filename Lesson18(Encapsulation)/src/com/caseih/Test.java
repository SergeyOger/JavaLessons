package com.caseih;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("");
		person1.setAge(0);
		System.out.printf("%s %d/n",person1.getName(),person1.getAge());
	}

}

class Person {
	private String name;
	private int age;

	public void setName(String name) {
		if(name.isEmpty()) {
			System.out.println("Insert name");
		}else {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if(age<=0) {
			System.out.println("Age mast be positive ");
		}else {
		this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

}