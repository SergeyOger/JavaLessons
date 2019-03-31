import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExeptionsLerning {
	public static void main(String[] args) {
		/*
		File file = new File("NewFile");

		try {
			Scanner scanner = new Scanner(file);
			System.out.println("After scanner");
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден");
		}

		System.out.println("Comtinue programm");
		*/
		try {
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println("Eception in main block");
		}
	}
	public static void readFile() throws FileNotFoundException {
		File file = new File("NewFil");
		Scanner scanner = new Scanner(file);
	}
}
