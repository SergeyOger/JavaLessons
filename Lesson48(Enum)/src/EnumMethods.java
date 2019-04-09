
public class EnumMethods {

	public static void main(String[] args) {
		Season season = Season.AUTUM;
		System.out.println(season.name());

		Animal animal = Animal.CAT;
		System.out.println(animal.name());

		Animal cat = Animal.valueOf("CAT");
		System.out.println(cat.getTranslation());
		
		Season winter = Season.WINTER;
		System.out.println(winter.ordinal());

	}

}
