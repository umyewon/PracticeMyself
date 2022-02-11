package chap12.sec05.wait_notify2;

public class ProducerThread extends Thread{
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.setName("ProducerThread");
		this.dataBox = dataBox;
	}
	
	// 데이터를 생성
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	
	}
}
