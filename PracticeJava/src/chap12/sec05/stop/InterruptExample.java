package chap12.sec05.stop;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		// �Ͻ� ���� ���¿��� ���ܰ� �߻��ϴ� �޼ҵ� - �Ͻ����� ���¸� ���������ζ� ���� �ʿ䰡 ����
		thread.interrupt();
	}

}
