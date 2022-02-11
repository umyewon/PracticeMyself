package chap12.sec05.wait_notify2;

public class ConsumerThread extends Thread{
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsumerThread");
		this.dataBox = dataBox;
	}
	
	// 데이터를 이용
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			String data = dataBox.getData();
		}
	
	}
}
