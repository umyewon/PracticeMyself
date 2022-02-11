package chap12.sec05.wait_notify2;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producer = new ProducerThread(dataBox);
		ConsumerThread consumer = new ConsumerThread(dataBox);
		
		producer.start();
		consumer.start();
	}

}
