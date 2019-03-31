import com.caseih2.Test2;

public class SrcClass extends Test2 {
	public static void main(String[]args) {
		Test2 testAccess = new Test2();
		testAccess.publicName = "Some name"; // only public name access 
		System.out.println(Test2.CONSTANT);
	}
}
