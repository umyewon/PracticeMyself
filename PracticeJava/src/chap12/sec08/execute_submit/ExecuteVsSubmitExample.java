package chap12.sec08.execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {

	public static void main(String[] args) throws Exception{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 10; i++) {
			
		// 결과 값이 없는 작업 정의
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
				int poolSize = threadPoolExecutor.getPoolSize();  // 스레드 개수 얻기
				String threadName = Thread.currentThread().getName();
				System.out.println("[총 스레드 개수 : " + poolSize + "] 작업 스레드 이름 : " + threadName);
				
				// 고의적으로 예외 발생 NumberFormatException
				int value = Integer.parseInt("삼");
			}
		};
		
		//executorService.execute(runnable);    execute()는 예외가 발생하면 해당 스레드를 제거하고 다시 생성
		executorService.submit(runnable);  // submit()는 예외가 발생하면 해당 작업 종료 후 다음 작업 처리
		
		Thread.sleep(10);
		}
		
		// 작업 처리 완료 후 스레드풀 종료
		executorService.shutdown();
		
	}

}
