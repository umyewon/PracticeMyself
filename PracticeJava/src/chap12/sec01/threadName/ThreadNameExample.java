package chap12.sec01.threadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + thread.getName());
		
		Thread threadA = new ThreadA();
		// System.out.println("ThreadA�� ������ ������ : " + Thread.currentThread().getName());
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("ThreadB�� ������ ������ : " + Thread.currentThread().getName());
		threadB.start();
	}

}
