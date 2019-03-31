
public class Car {
	private int id;

	// Вложенный не статический класс / Nested, not static class

	private class Motor {
		public void startMotor() {
			System.out.println("Motor" + id + " is starting...");
		}
	}
	// static nested class / use for grouping classes logics 
	public static class fuelTank{
		public void lockUpFuel() {
			System.out.println("Lock up fuel..");
		}
	}

	public Car(int id) {
		this.id = id;
	}

	public void start() {
		Motor motor = new Motor();
		motor.startMotor();
		System.out.println("Car " + id + " is started");
		
		final int x = 1;
		// для получения доступа к перменным во вложенном классе, они должны дыть final
		
		
		class SomeClass{
			public void someMethod() {
				System.out.println(x + id);
			}
		}
	}

}
