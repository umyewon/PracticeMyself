package chap12.sec07.exam01_threadgroup;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");   // main 그룹 하위에 생성됨
		WorkThread workThreadA = new WorkThread(myGroup, " workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, " workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소들 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("{ myGroup 스레드 그룹의 interrup() 메소드 호츌 }");
		myGroup.interrupt();
	}

}
