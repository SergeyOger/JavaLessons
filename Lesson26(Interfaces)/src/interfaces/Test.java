package interfaces;

public class Test {

	public static void main(String[] args) {
		Info info = new Animal(1);
		Person person = new Person("Ben");
		outputInfo(info);
		outputInfo(person);
		

	}
	
	public static void outputInfo(Info info) {
		info.showInfo();
	}

}
 