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
		 * @Override public void run() { // �������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾� Toolkit toolkit =
		 * Toolkit.getDefaultToolkit(); for(int i = 0; i < 5; i++) { toolkit.beep(); try
		 * { Thread.sleep(500); // 0.5�ʰ� �Ͻ� ���� } catch(Exception e) {} } } });
		 */
		
		// how 3
		Thread thread = new Thread( () -> {
			// �������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500); 	// 0.5�ʰ� �Ͻ� ����
				} catch(Exception e) {}
			}
		});

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
