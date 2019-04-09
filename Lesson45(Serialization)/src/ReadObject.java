import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("People.bin"))) {
			/*
			FileInputStream fis = new FileInputStream("People.bin");  // file ==>  byte 
			ObjectInputStream ois = new ObjectInputStream(fis);  // byte ==> object 
			
			/* 
			 ----------------------------------------------------------------------------------------------------------
			 * First method for reading object from file
			
			int personCount = ois.readInt(); 				// variable for reading numbers of object 
			
			Person[] people = new Person[personCount];
			
			for(int i = 0; i < personCount;i++) { 			// cycle for reading objects with file 
				people[i] = (Person) ois.readObject();
			}
			
			System.out.println(Arrays.toString(people)); 	// Return a string representation of the contents 
			-------------------------------------------------------------------------------------------------------------
			*/
			// Second method for reading object
			Person[] people = (Person[]) ois.readObject();
			System.out.println(Arrays.toString(people));
			
			// ois.close(); before try with resources
			
;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
