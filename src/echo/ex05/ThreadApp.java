package echo.ex05;

public class ThreadApp {

	public static void main(String[] args) {
		
		Runnable digit = new DigitRunableImpi();
		
		Thread thread1 = new Thread();
		
		thread1.start();
		
		for (int cnt=0; cnt<=10; cnt++) {
			System.out.println(cnt);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
