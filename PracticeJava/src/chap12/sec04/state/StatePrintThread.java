package chap12.sec04.state;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
	  while(true) {
		Thread.State state = targetThread.getState();  // 스레드의 상태 얻기
		System.out.println("타겟 스레드 상태 : " + state);
		
		if(state == Thread.State.NEW ) {
			targetThread.start();  // run 메소드 호출
		}
		
		if( state == Thread.State.TERMINATED) {
			break;
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}
	  }
	}
	
}
