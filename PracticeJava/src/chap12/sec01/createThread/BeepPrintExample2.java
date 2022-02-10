package chap12.sec01.createThread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// how 1
		/*
		 * Runnable beepTask = new BeepTask(); 
		 * Thread thread = new Thread(beepTask);
		 */
		
		// how 2
		/*
		 * Thread thread = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { // 비프음을 5번 반복해서 소리나게 하는 작업 Toolkit toolkit =
		 * Toolkit.getDefaultToolkit(); for(int i = 0; i < 5; i++) { toolkit.beep(); try
		 * { Thread.sleep(500); // 0.5초간 일시 정지 } catch(Exception e) {} } } });
		 */
		
		// how 3
		Thread thread = new Thread( () -> {
			// 비프음을 5번 반복해서 소리나게 하는 작업
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500); 	// 0.5초간 일시 정지
				} catch(Exception e) {}
			}
		});

		thread.start();
		
		// "띵" 문자열 5번 출력
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); 	// 0.5초간 일시 정지
			} catch(Exception e) {}
		}
		
		/* 소리와 함께 문자가 출력되기를 바랬지만, 소리가 출력된 뒤 문자가 출력 됨 => 싱글 스레드 이기 때문 */
		
	}

}
