/*
 *byte (number, 1 byte 		-128 - 127)
 *short (number, 2 bytes  	-32768 - 32767)
 *int (number, 4 bytes		-2147483648 - 2147483647)
 *long (number, 8 bytes		-9223372036854775808 - 9223372036854775807)
 *float (float number, 4 bytes)
 *double (float number, 8 bytes)
 *char (a character, 2 bytes)
 *boolean (true or false, 1 byte) 
 */

public class Variables {

	public static void main(String[] args) {
		// множество всех целых чисел int
		int x;
		x = 5;
		int y = 6;
		System.out.printf(x + " " + y + "\n");
		var number = 60;
		var name = "Bob";
		var z = 143.6;
		System.out.println(number + " " + name + "\n" + z);
		/*
		 * если переменная объявляется с помощью var, то мы обязательно должны
		 * инициализировать ее, то есть предоставить ей начальное значение, иначе мы
		 * получим ошибку
		 */

		/*
		 * константы. В отличие от переменных константам можно присвоить значение только
		 * один раз. Константа объявляется также, как и переменная, только вначале идет
		 * ключевое слово final: константы имеют имена в верхнем регистре.
		 */
		final int FINALINT = 50;
		final var PFONENUMBER = 98756423122L;

		double myDouble = 3256.23;
		float myFloat = 465.3225f;
		System.out.println(myDouble + " " + myFloat);

		char c = 'F';// хранит символ

		boolean b = true;

		/*
		 * По умолчанию, все целочисленные переменные в Java имеют тип int, для указания
		 * иеного типа используеться приписка в случае с long - L(лучше большая, так как
		 * малая похожа на 1) Такая же приписка нужна для вещественных типов данных. По
		 * умолчания в Java используеться double. для создания переменной типа float
		 * нужна приписка f в конце значения
		 * 
		 */

	}

}
