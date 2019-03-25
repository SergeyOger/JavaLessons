
public class Break_Continue {

	public static void main(String[] args) {
		/*
		 * Break используеться для выхода из цикла,при вызове этого оператора цикл немедленно завершаеться 
		 
		int i = 0;
		while(true) {
			if(i==15) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Cycle finish");
		*/
		for(int i = 0; i<=15; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println("Odd number " + i); // нечётное число
		}

	}

}
