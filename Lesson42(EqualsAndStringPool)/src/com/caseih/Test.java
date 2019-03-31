package com.caseih;

public class Test {

	public static void main(String[] args) {

		// == only for primitive type
		int x = 1;
		int y = 1;
		System.out.println(x == y);

		/*
		 * при сравнивании двух структурных объектов, метод "==" не сработает, так как
		 * он сравнивает ссылки на объекты, а не сами объекты
		 */

		// Создание объектов для сравнения их в перееопределённом методе equals
		Animal animal = new Animal(1);
		Animal animal2 = new Animal(2);
		System.out.println(animal.equals(animal2));

		String string = "Hello"; // при таком методе создания строки, сравнение "==" сработает, string pool
		String string2 = "Hello";
		System.out.println(string.equals(string2));
		// use string pool Автоматический поиск одинаковых значений строки при её
		// создании
		System.out.println(string == string2);

		// stringpool не сработает в случае:
		String a = "hello";
		String b = "hello123".substring(0, 5);

		System.out.println(a == b);

	}

}

class Animal {
	int id;

	public Animal(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * для сравнивания объектов, нужно переопределить метод по умолчанию в классе
		 * Object Условие: Объекты равны, если поля id равны По умолчанию мы обязаны
		 * принимать на вход объекты класса Object.но мы на вход принимаем объекты
		 * класса Animal. Поэтому нужно применить Downcasting
		 */
		Animal otherAnimal = (Animal) obj;
		return this.id == otherAnimal.id;
	}
}
