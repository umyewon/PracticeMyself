package chap12.sec08.blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		// 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()	// 현재 이 프로그램을 실행하는 컴퓨터의 CPU의 코어의 수 리턴
		);
		
		// 작업 처리 요청
		System.out.println("[작업 처리 요청]");
		Callable<Integer> task = new Callable<>() {
			
			@Override
			public Integer call() {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		
		Future<Integer> future = executorService.submit(task);  // 리턴 값이 없는 작업 완료 통보
		
		try {
			 int sum = future.get();    // 스레드가 작업을 완료하기 전까지는 get() 메소드는 블로킹 됨
			 System.out.println("[처리 결과] " + sum);
			 System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			  System.out.println("[예외 발생함]" + e.getMessage());
		} 
		
		executorService.shutdown();
	}

}
