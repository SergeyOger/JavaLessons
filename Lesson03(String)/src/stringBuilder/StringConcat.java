package stringBuilder;

public class StringConcat {

	public static void main(String[] args) {
		Person person = new Person("Sergey", 24);
		person.info();
		Emploer emploer = new Emploer("Sergey", 25, "sales");
		emploer.info();

	}

}

class Person{     
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.setAge(age);
		this.setName(name);
		
	}
	public void info() {
		System.out.printf("Name : %s\n" + "Age : %d\n",getName(),getAge());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
