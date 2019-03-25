
public class Arrays_Learning {

	public static void main(String[] args) {
		/*
		 * int number = 10; примитивный тип данных 
		 * char character = 'a'; примитивный тип данных 
		 * String s ="Hello"; //ссылочный тип данных 
		 *  массив - это ссылочный тип данных
		 */

		/*
		 * При создании массива все его ячейки инициализируються, по умолчанию все
		 * значения равны "0" Нумерация ячеек начинаеться с нуля
		 */
		int[] numbers = new int[5]; // мссив с пустыми чейками
		System.out.println(numbers[0]);
		System.out.println();
		// numbers[0] = 5; инициализация ячеек массива отдельно каждого элемента

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
			System.out.printf("Arrey index %d, index value is %d\n", i, numbers[i]);
			// инициализация ячеек массива с помощью цикла
		}

		int[] numbers1 = { 1, 2, 3, 4, 5 }; // инициализация массива с указанием значений ячеек
		for (int i = 0; i < numbers1.length; i++) {
			System.out.printf("\n" + numbers1[i]);
		}

	}

}
