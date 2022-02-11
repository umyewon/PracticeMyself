package chap12.sec06.daemon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSavedThread autoSaveThread = new AutoSavedThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(5000);		// 5초 뒤 메인 스레드 종료
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}

}
