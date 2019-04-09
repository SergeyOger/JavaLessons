import static java.lang.System.*;

public class StringLearning {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Some name spase ");
		String name = "Java";
		
		
		StringBuilder newString = new StringBuilder("Java it's coll");
		StringBuilder builder = new StringBuilder("Java it's coll");
		
		/*System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.codePointAt(2));
		*/
		System.out.println(builder.compareTo(newString)); // compare length of two strings 
		System.out.println(sb.chars());
		out.println("Hello");

	}

}
