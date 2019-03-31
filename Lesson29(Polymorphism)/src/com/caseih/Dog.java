package com.caseih;

public class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is bark");
	}
	@Override
	public void animalEating() {
		System.out.println("Dog eating");
	}

}
