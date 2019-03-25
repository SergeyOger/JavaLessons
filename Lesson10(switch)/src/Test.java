import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert age");

		/*
		int age = scanner.nextInt();
		switch (age) {
		case 0:
			System.out.println("you are born");
			break;
		case 7:
			System.out.println("You go to school");
			break;

		}
		*/
		String age = scanner.nextLine();
		switch(age) {
		case "null":
			System.out.println("You age is 0");
			break;
		case "seven":
			System.out.println("You age is seven");
			break;
		case "more":
			System.out.println("You age is more than seven");
			break;
		}
		scanner.close();
		

	}

}
