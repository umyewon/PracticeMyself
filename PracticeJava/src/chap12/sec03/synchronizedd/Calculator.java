package chap12.sec03.synchronizedd;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);     // 2�ʰ� ������ �Ͻ� ����
		} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
