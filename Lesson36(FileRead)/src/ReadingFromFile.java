import java.util.*;
import java.io.*;


public class ReadingFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		//String separator = File.separator;
		//String path = separator + "Users" + separator + "Case-IH" + separator + "Desktop" + separator + "Test.txt";
		//String path = separator + "Users" + separator + "Case-IH" + separator + "Desktop" + separator + "Test2.txt";
		//File file = new File(path);
		File file = new File("Test3");
		
		Scanner scanner = new Scanner(file);
		/*
		 * while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		*/
		
		String line = scanner.nextLine();
		String[] numbersString = line.split(" ");
		int[] numbers = new int[3];
		int counter = 0;
		
		
		for(String number : numbersString) {
			numbers[counter++] = Integer.parseInt(number);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(line);
		scanner.close();
		

	}

}
