package chap12.sec01.createThread;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// how 1
		/*
		 * Thread thread = new BeepThread(); 
		 * thread.start();
		 */
		
		// how 2
		Thread thread = new Thread() {
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
		};
		thread.start();

		// "��" ���ڿ� 5�� ���
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500); 	// 0.5�ʰ� �Ͻ� ����
			} catch(Exception e) {}
		}
		
		/* �Ҹ��� �Բ� ���ڰ� ��µǱ⸦ �ٷ�����, �Ҹ��� ��µ� �� ���ڰ� ��� �� => �̱� ������ �̱� ���� */
		
	}

}
