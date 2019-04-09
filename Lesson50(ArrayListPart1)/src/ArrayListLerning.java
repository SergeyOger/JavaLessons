import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLerning {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); //great ArrayList
		for (int i = 0; i < 10; i++) {
			list.add(i); // add objects for array list
		}

		System.out.println(list);  // display elements first method

		System.out.println(list.get(0)); // get element with index [0]

		System.out.println(list.size()); // get Array List size

		for (int i = 0; i < list.size(); i++) { // Print all elements of Array List
			System.out.println(list.get(i));
		}

		for (Integer integer : list) { // for each  
			System.out.println(integer);
		}

		list.remove(5); // remove elements with array list( to slowly with many elements of array list)
		
		// if we delete many elements with ArrayList, we can do next:
		
		
		list = new LinkedList<Integer>();

	}

}
