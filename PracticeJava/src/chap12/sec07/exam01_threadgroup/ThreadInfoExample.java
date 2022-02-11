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
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();		// stack�� �ִ� ��� ������ ���� ������
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + (thread.isDaemon() ? "(����)" : "(��)"));
			System.out.println("\t" + "�Ҽ� �׷� : " + thread.getThreadGroup().getName());
			System.out.println();
		}
		
		
	}

}
