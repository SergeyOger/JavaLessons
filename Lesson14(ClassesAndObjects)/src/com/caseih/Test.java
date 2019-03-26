package com.caseih;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Sergey";
		person1.age = 50;
		System.out.println("Меня зовут " + person1.name + "," + " мне " + person1.age);
		Person person2 = new Person();
		person2.name = "Jon";
		person2.age = 30;
		System.out.println("Меня зовут " + person2.name + "," + " мне " + person2.age);
	}

}

/*
 * У класса иожет быть: 1.данные - поля 2.методы - действия которые он может
 * совершать
 */

class Person {
	String name;
	int age;
}