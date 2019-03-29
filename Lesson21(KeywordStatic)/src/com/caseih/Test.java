package com.caseih;

public class Test {

	public static void main(String[] args) {
		Human human1 = new Human("Jon",35);
		Human human2 = new Human("Ben",32);
		human1.printNumberOfPeople();
		human2.printNumberOfPeople();
		
	}
	

}

class Human {
	private String name; 
	//Переменные объекта, классу не пренадлежат
	private int age;
	public static String description; 
	private static int counPeople;
	// переменные класса, доступны всем объектам данного класса
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		counPeople++;
	}

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
	
	public void getAllfields() {
		System.out.println(name + "," + age + "," + description);
	}
	/*
	public static void printAllfields() {
		System.out.println(name + "," + age + "," + description); // Cannot make a static reference to the non-static field age
	}
	*/
	
	public void printNumberOfPeople() {
		System.out.println("Nuber of people is " + counPeople);
	}
}
