package chap12.sec05.yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();	// a ����
		threadB.start();	// b ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = false;                  // b�� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = true;                  // a, b ��� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.stop = true;                  // a, b ��� ����
		threadB.stop = true;                  // a, b ��� ����
		/* stop() �޼ҵ�� ���α׷��� �������� �ϱ� ������ �Ҿ����� ���°� �� �� �����Ƿ� �ǵ��� ������� �ʴ°��� ���� */
	}

}
