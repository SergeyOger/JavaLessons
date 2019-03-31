package com.caseih;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(new Animal(1));
		listOfAnimals.add(new Animal(2));

		List<Dog> listOfDogs = new ArrayList<Dog>();
		listOfDogs.add(new Dog());
		listOfDogs.add(new Dog());

		test(listOfAnimals);
		test(listOfDogs);
	}

	/*
	 * Object
	 * Animal
	 * Dog
	 * ? принимаем на вход любые объекты 
	 * extends Animal принимаем на вход только объекты класса Animal и его наследников 
	 * Animal
	 * Dog
	 * ? supper Animal либо елементы класса Animal либо выше по иерархии
	 * Object 
	 * Animal
	 */
	
	private static void test(List<? extends Animal> list) {
		for (Animal animal : list) {
			System.out.println(animal);
			animal.eat();
		}
	}

}
