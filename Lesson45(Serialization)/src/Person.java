import java.io.Serializable;

/* Part 1
 * Writing and reading  each object separately to the file using cycle " for "
 * 
 * Part 2
 * Writing and reading array of objects
 * 
 * Part 3 
 * Transient and serialVersionUID
 * 
 * Part 4 Try with resources
 * 
 * for writing class for file we need implements class Serialaizeble
 */

public class Person implements Serializable{
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2737410280798293032L; 
	// if you change class,
	//you mast regenerate serialVersionUID
	
	private int id;  // do not writing this field to the file - transient
	private String personName; 
	int age;
	
	
	
	
	public Person(int id, String name) {
		this.id = id;
		this.personName = name;
	}
	
	public String getName() {
		return personName;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return id + " : " + personName;
	}
}
