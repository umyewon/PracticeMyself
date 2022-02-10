package chap12.sec01.createThread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		// 비프음을 5번 반복해서 소리나게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); 	// 0.5초간 일시 정지
			} catch(Exception e) {}
		}
	
	}

}
