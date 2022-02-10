package chap12.sec05.yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();	// a 실행
		threadB.start();	// b 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = false;                  // b만 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = true;                  // a, b 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.stop = true;                  // a, b 모두 종료
		threadB.stop = true;                  // a, b 모두 종료
		/* stop() 메소드는 프로그램을 강제종료 하기 때문에 불안정한 상태가 될 수 있으므로 되도록 사용하지 않는것이 좋다 */
	}

}
