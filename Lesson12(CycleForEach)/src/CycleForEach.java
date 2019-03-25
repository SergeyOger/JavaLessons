
public class CycleForEach {

	public static void main(String[] args) {

		// Part 1

		int[] numbers = new int[5];
		numbers[0] = 5;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);

		String[] strings = new String[3];
		strings[0] = "Hello";
		System.out.println(strings[0] + " " + strings[1]);

		for (int i : numbers) {
			System.out.println(i);

		}

		// For each "String - data type", "string - local var", " strings - array name"
		for (String string : strings) {
			System.out.println(string);
		}

		int[] testFoEach = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int x : testFoEach) {
			sum = sum + x;
		}
		System.out.println("Sum is:" + sum);

	}

}
