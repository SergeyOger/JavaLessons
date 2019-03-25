
/*
 * String это ссылочный тип данных
 * названия начинаються с заглавной, так как String являеться классом
 * 
 */
public class StringLearning {

	public static void main(String[] args) {

		String s = "Some text";
		var name = "Jim";
		System.out.println(name);

		// Способы применения класса String

		System.out.println("Name \n" + s); // создание переменной помещением значения в " var " в скобки

		String name1 = "0123456789 \n"; // присвоение значения переменной, а затем
		System.out.println(name1);// ее использование

		System.out.println("abc " + name1);
		/*
		 * использование переменной с заданным значением и переменной созданой внесением
		 * в скобки
		 */
		String c = "abc".substring(0, 2); // отбрасывание значений до начального индекса(включительно) и после
											// финального индекса
		System.out.println(c);

		String d = name1.substring(0, 7);
		System.out.println(d);

		System.out.println(name1.length() + " name1 lengs"); // получение длины стороки

		System.out.println(name.concat(" concat")); // объеденить 2 строки
		System.out.println(name + " " + c);// можно несколькими способами

		
		
		/*
		 * Класс StringBuffer Существует четыре конструктора класса:
		 * 
		 * StringBuffer() - резервирует место под 16 символов без перераспределения
		 * памяти
		 * 
		 * StringBuffer(int capacity) - явно устанавливает размер буфера
		 * 
		 * StringBuffer(String string) - устанавливает начальное содержимое и
		 * резервирует 16 символов без повторого резервирования
		 * 
		 * StringBuffer(CharSequence cs) - создаёт объект, содержащий последовательность
		 * символов и резервирует место ещё под 16 символов
		 */

		StringBuffer newName = new StringBuffer("Some new name ");

		System.out.println("Name length " + newName.length()); // Выводит длину стороки

		System.out.println(newName.capacity()); // количество занимаемой памяти(резервирует 16 символов
		// для улучшения производительности

		System.out.println(newName.append(false)); // соединение в обну строку розличных типов данных
		System.out.println(newName.append(60)); //
		System.out.println(newName.append(d)); //

		StringBuffer cat = new StringBuffer("Big fat ");
		/*
		 * insert позволяет вставить одну строку в другую, при этом нужно указывать
		 * индекс позиции и значение переменной
		 */
		StringBuffer catLike = new StringBuffer("cat");
		System.out.println(cat.insert(8, catLike));

		/*
		 * reverse переворачивает последовательность символов
		 */

		System.out.println(newName.reverse());

		StringBuffer buf = new StringBuffer("Testing String Buffer");// заменяет символы указаной строки на символы
																		// другой строки
		System.out.println(buf.replace(0, 1, "i"));// требует указания начального и конечного индекса изменяемой строки
		
		StringBuffer buf1 = new StringBuffer("Testing");
		System.out.println(buf1.substring(0, 5));
		
		/*ласс StringBuilder идентичен классу StringBuffer и обладает большей производительностью.
		 *  Однако он не синхронизирован, поэтому его не нужно использовать в тех случаях, 
		 *  когда к изменяемой строке обращаются несколько потоков.
		 */
		
		StringBuilder newBuilder = new StringBuilder("Name");
		int length = newBuilder.length();
		System.out.println(length);
		System.out.println(newBuilder.append(" my"));
		System.out.println(new StringBuilder("Boolean ").append(" is ").append(true).append(" number " + 5));
		

	}

}
