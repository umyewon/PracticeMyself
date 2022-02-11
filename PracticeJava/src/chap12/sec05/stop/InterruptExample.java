package chap12.sec05.stop;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		// 일시 정지 상태에서 예외가 발생하는 메소드 - 일시정지 상태를 고의적으로라도 만들 필요가 있음
		thread.interrupt();
	}

}
