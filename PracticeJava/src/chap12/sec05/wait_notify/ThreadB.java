package chap12.sec05.wait_notify;

public class ThreadB extends Thread{
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {
		super();
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++ ) {
			workObject.methodB();
		}
	
	}
}
