package chap12.sec05.wait_notify2;

public class DataBox {
	private String data;
	
	// �Һ��� �����尡 ȣ��
	public synchronized String getData() {
		if(this.data == null) { // �����Ͱ� ���� �� �Һ��� �Ͻ�����
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("ConsunerThread�� ���� ������ : " + returnValue);
		data = null;  // ������ �ʱ�ȭ
		notify();	  // �����͸� ���� �� ������ ������ ���� ���
		
		return returnValue;
	}

	// ������ �����尡 ȣ��
	public synchronized void setData(String data) {
		if(this.data != null) { // �Һ��� �����尡 ���� �����͸� �б��� = �ߺ� ������ ���ϱ� ���� ������ �Ͻ�����
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		// �Һ��� �����尡 �����͸� ���� ���� = data==null = ���ο� �����͸� �־���ߵ�
		this.data = data;
		System.out.println("ProducerThread�� ������ ������ :" + data );
		notify();  // �Һ��ڰ� ���� ä�� �����͸� ���� �� �ְ� wait������ ���� �����ֱ�
		this.data = data;
	}
	
	
}
