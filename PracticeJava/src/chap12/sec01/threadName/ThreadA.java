package chap12.sec01.threadName;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
			
		}
	}
}
