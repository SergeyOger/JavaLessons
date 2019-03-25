import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value; 
		/*
		System.out.println("Insert 5");
		
		while(value!=5) {
			System.out.println("Insert 5");
			value = scanner.nextInt();
		}
		System.out.println("you insert 5");
		*/
		
		do {
			System.out.println("Insert 5");
			value = scanner.nextInt();
			
		}while(value!=5);
		
		System.out.println("You insert 5");

	}

}
