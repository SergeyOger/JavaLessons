package com.caseih;

interface AbleToEat{
	public void eat();
}

public class Test {

	public static void main(String[] args) {
		/*example 1
		 * Animal animal = new Animal(); 
		 * animal.eat(); 
		 * OtherAnimal otherAnimal = new OtherAnimal(); 
		 * otherAnimal.eat();
		 
		Animal animal = new Animal() {
			
			 * can use only once (non-Javadoc)
			 * 
			 * @see com.caseih.Animal#eat() this object not Animal object
			 
			@Override
			public void eat() {
				System.out.println("Other animal is eating...");
			}
		};
		animal.eat();
		*/
		
		//AbleToEat ableToEat = new Animal(); example 2
		//ableToEat.eat();
		AbleToEat ableToEat = new AbleToEat() { // use only once
			
			@Override
			public void eat() {
				System.out.println("Example 3");
				
			}
		};
		ableToEat.eat();
	}

}
/*example 2
class Animal implements AbleToEat{
	@Override
	public void eat() {
		System.out.println("Overrided method eat");
		
	}
}
*/

/*example 1
class Animal {
	public void eat() {
		System.out.println("Animal is eating...");
	}
}

class OtherAnimal extends Animal {
	@Override
	public void eat() {
		System.out.println("Other animal is eating...");
	}
}
*/
