package chap12.sec05.wait_notify2;

public class DataBox {
	private String data;
	
	// 소비자 스레드가 호출
	public synchronized String getData() {
		if(this.data == null) { // 데이터가 없을 때 소비자 일시정지
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("ConsunerThread가 읽은 데이터 : " + returnValue);
		data = null;  // 데이터 초기화
		notify();	  // 데이터를 읽은 뒤 생성자 스레드 실행 대기
		
		return returnValue;
	}

	// 생성자 스레드가 호출
	public synchronized void setData(String data) {
		if(this.data != null) { // 소비자 스레드가 아직 데이터를 읽기전 = 중복 저장을 피하기 위해 생성자 일시정지
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		// 소비자 스레드가 데이터를 읽은 상태 = data==null = 새로운 데이터를 넣어줘야됨
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 :" + data );
		notify();  // 소비자가 새로 채운 데이터를 읽을 수 있게 wait상태인 것을 깨워주기
		this.data = data;
	}
	
	
}
