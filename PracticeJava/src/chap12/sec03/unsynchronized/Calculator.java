package chap12.sec03.unsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);     // 2�ʰ� ������ �Ͻ� ����
		} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
