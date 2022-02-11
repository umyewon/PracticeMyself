package chap12.sec08.blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		// 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()  // 현재 이 프로그램을 실행하는 컴퓨터의 CPU의 코어의 수 리턴
		); 
		
		System.out.println("[작업 처리 요청]");
		class Task implements Runnable {
			Result result;
			
			Task(Result result){
				this.result = result;
			}

			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				result.addValue(sum);
			}
		};
		
		// 공유 객체 (외부 객체)
		Result result = new Result();
		
		// 하나의 객체로 두개의 작업을 정의
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		
		// task가 처리 완료될 때 까지 대기 (블로킹)
		try {
			// 실질적으로 result는 같은 객체이지만 각각의 결과를 저장 후 취합
			result = future1.get();
			result = future2.get();
			System.out.println("[처리 결과]" + result.accumValue);  // 55 + 55 = 110 
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}  
	}
}

class Result{
	int accumValue;
	
	synchronized void addValue(int value) { // 공유 객체이기 때문에 동기화 메소드
		accumValue += value;
	}
}
