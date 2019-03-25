package stringBuilder;

public class Emploer extends Person{
	private String department;

	public Emploer(String name, int age, String department) {
		super(name, age);
		this.department = department;
		
	}
	
	public void info() {
		System.out.printf("Name : %s\n" + "Age : %d\n" + "Department : %s",getName(),getAge(),department);
	}

}
