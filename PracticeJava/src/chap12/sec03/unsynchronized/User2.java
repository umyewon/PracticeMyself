package chap12.sec03.unsynchronized;

public class User2 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2");		// 스레드의 이름 지정
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
