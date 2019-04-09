import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		
		Person[] people = {new Person(1, "Bob"),new Person(2, "MIke"), new Person(3, "Jeremy")};

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("People.bin"))) {
			/* Before try with resources
			//FileOutputStream fos = new FileOutputStream("People.bin"); // byte ==> file

												// FileOutputStream - method for writing byte to the file

			//ObjectOutputStream oos = new ObjectOutputStream(fos); // object ==> byte

												// ObjectOutputStream - method convert objects to byte
		
			/*
			 * ---------------------------------------------------------------------------------------------------------------------
			//first method for writing objects to the file
			
			oos.writeInt(people.length); 		// array length write to the file
			
			for(Person person : people) { 		// for each for write object to the file
				oos.writeObject(person);
			}
			------------------------------------------------------------------------------------------------------------------------------------
			*/
			
			//Second method for writing objects
			
			oos.writeObject(people);

			//oos.close();  Before try with resources

		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
