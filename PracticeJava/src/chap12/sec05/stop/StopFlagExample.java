package chap12.sec05.stop;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		// 1초간 정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		// 후 종료
		printThread.setStop(true);
		
	}

}
