
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// Java 5
		
		List animals = new ArrayList();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Frog");
		
		String animal = (String)animals.get(1);
		System.out.println(animal);
		
		// After Java 5
		
		List<String> animals2 = new ArrayList<String>();
		animals2.add("Dog");
		animals2.add("Cat");
		animals2.add("Horse");
		System.out.println(animals2.get(0));
		
		
		//Java 7
		
		List<String> animals3 = new ArrayList<>();
	}

}
