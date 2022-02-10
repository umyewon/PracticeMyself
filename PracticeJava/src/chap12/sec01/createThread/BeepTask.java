package chap12.sec01.createThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		// �������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); 	// 0.5�ʰ� �Ͻ� ����
			} catch(Exception e) {}
		}
	}

}
