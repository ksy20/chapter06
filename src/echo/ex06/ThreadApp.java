package echo.ex06;

public class ThreadApp {

	public static void main(String[] args) {
		Runnable digit = new DigitImpi(); 
		Runnable lower = new LowerImpi();
		Runnable upper = new UpperImpi();
		
		Thread thread1 = new Thread(digit);
		Thread thread2 = new Thread(lower);
		Thread thread3 = new Thread(upper);
		
		thread1.start();
		thread2.start();
		thread3.start();
	

	}

}
