package chap12.sec01.createThread;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// �������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("��");
			try {
				Thread.sleep(500); 	// 0.5�ʰ� �Ͻ� ����
			} catch(Exception e) {}
		}
		
		// "��" ���ڿ� 5�� ���
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("��");
			try {
				Thread.sleep(500); 	// 0.5�ʰ� �Ͻ� ����
			} catch(Exception e) {}
		}
		
		/* �Ҹ��� �Բ� ���ڰ� ��µǱ⸦ �ٷ�����, �Ҹ��� ��µ� �� ���ڰ� ��� �� => �̱� ������ �̱� ���� */
		
	}

}
