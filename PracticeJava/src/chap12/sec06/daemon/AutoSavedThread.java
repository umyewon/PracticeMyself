package chap12.sec06.daemon;

public class AutoSavedThread extends Thread{
	public void save() {
		System.out.println("�۾� ������ ������");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;	
			}
			save();	// 1�� ������ ����ǰ�
		}
	}
}
