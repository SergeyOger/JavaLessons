
public class LearnIf {

	public static void main(String[] args) {
		/*
		 * int myInt = 15; if(myInt<10) { System.out.println("Correct");
		 * 
		 * }else if(myInt>20){ System.out.println("Error"); } else {
		 * System.out.println("No result"); }
		 */

		/* При выполнении цикла условия проверяються сверху в низ
		 * как только в цикле будет найдено удовлетворяющее значение, программа будет остановлена
		 * и цикл будет завершён. Остальные условия проверяться не будут.
		 */
		
		int myInt = 5;

		if (myInt < 10) {
			System.out.println("Correct");

		} else if (myInt < 20) {			//операторов if может быть бесконечное множество
			System.out.println("Error");
		} else {
			System.out.println("No result");
		}

	}

}
