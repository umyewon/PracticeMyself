package chap12.sec05.stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		/*
		 * try { while(true) { System.out.println("���� ��");
		 * 
		 * Thread.sleep(1); 
		 * //interrupted �޼ҵ�� �����ϰ� �����ϱ� ���� ���� ª�� �ð����� �Ͻ�������Ŵ => 
		 * // InterruptedException �߻��ż� run()�� ����� 
		 * // ==> ���������� ���� ��Ű�� ���� ���� ���� �ڵ��� ����
		 * Thread.interrupted() �Ǵ� isInterrupted() �޼ҵ� ��� } } catch
		 * (InterruptedException e) { System.out.println("�ڿ� ����");
		 * System.out.println("���� ����"); }
		 */
		
		// ��� 1
		/*
		 * while(true) { System.out.println("���� ��"); 
		 * if(Thread.interrupted()) { //
		 * interrupt() �޼ҵ尡 ȣ�� �Ǹ� true ������ break; } } System.out.println("�ڿ� ����");
		 * System.out.println("���� ����");
		 */
		
		// ��� 2
		while(true) { 
			System.out.println("���� ��"); 
			if(isInterrupted()) { 
				// interrupt() �޼ҵ尡 ȣ�� �Ǹ� true ������
				break; 
			} 
		} 
			System.out.println("�ڿ� ����");
			System.out.println("���� ����");
	}
}