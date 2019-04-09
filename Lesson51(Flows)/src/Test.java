
public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello world");
		MyThread myThread = new MyThread();
		myThread.start();

		MyThread myThread2 = new MyThread();
		myThread2.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello from MainThread  " + i);
		}

		System.out.println("I am going to sleep");
		Thread.sleep(3000);
		System.out.println("I am awake");

		Thread thread = new Thread(new Runner());
		thread.start();

	}

}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello from MyThread  " + i);
		}
	}
}

class Runner implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello from Runner  " + i);
		}

	}

}