package com.caseih;

public class Test {

	public static void main(String[] args) {
		/*
		 * Animal animal = new Dog();
		 
		animal.animalEating();
		// void bark is not available, access only for parents voids
		
		Dog dog = new Dog();
		dog.bark();
		*/
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		test(animal);
		test(dog);
		test(cat);
		
	}
		 
	
	public static void test(Animal animal ) {
		animal.animalEating();
	}

}
