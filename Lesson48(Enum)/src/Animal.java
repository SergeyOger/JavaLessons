
public enum Animal {
	DOG("Собака"), CAT("Кот"), FROG("Лягушка");
	
	private String translation;
	
	Animal(String translatyion){
		this.translation = translatyion;
	}
	
	public String getTranslation() {
		return translation;
	}
	
	@Override
	public String toString() {
		return "Перевод на русский язык: " + translation;
	}
}
