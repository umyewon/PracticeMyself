package chap12.sec05.stop;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		// 1�ʰ� ����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		// �� ����
		printThread.setStop(true);
		
	}

}
