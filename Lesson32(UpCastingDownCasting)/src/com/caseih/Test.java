package com.caseih;

public class Test {

	public static void main(String[] args) {
		/*
		// Upcasting
		Animal animal = new Dog(); 
		animal.eat();
		Dog dog = new Dog();
		Animal animal2 = dog;
		animal2.eat();
		
		//Downcasting
		Dog dog2 = (Dog) animal;
		dog2.bark();
		*/
		Animal animal = new Animal();
		Dog dog =(Dog) animal;
		dog.bark();
	}

}
