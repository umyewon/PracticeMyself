package chap12.sec04.state;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();   // run �޼ҵ� ȣ��
		
	}

}
