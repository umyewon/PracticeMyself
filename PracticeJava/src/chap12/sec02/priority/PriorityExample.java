package chap12.sec02.priority;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++) {
			Thread thread = new CalcThread("Thread" + i);
			if(i != 30) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
