package chap12.sec07.exam01_threadgroup;

import java.util.Map;
import java.util.Set;

import chap12.sec06.daemon.AutoSavedThread;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSavedThread autoSaveThread = new AutoSavedThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();		// stack에 있는 모든 스레드 정보 가져옴
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + (thread.isDaemon() ? "(데몬)" : "(주)"));
			System.out.println("\t" + "소속 그룹 : " + thread.getThreadGroup().getName());
			System.out.println();
		}
		
		
	}

}
