import java.io.*;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("TestFile");
		PrintWriter printWriter = new PrintWriter(file);
		
		printWriter.println("Test row one"); // printWriter only for text files
		printWriter.println("Test row two");
		
		printWriter.close();

	}

}
