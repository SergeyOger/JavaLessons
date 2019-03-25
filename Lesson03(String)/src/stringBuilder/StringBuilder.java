package stringBuilder;

public class StringBuilder {

	public static void main(String[] args) {
		People people = new People("Jon", "Curver", 40);
		people.peopleInfoVoid();
		
		

	}

}
class People{
	
	private String firstName;
	private String secondName;
	private int age;
	
	
	
	public People(String peopleFirstName,String peopleSecondName, int peopleAge) {
		this.firstName = peopleFirstName;
		this.secondName = peopleSecondName;
		this.age = peopleAge;
		
	}
	
	public void peopleInfoVoid() {
		System.out.printf("First name %s\n" + "Second name %s\n" + "Age %d\n",firstName,secondName,age );
		
	}
}
