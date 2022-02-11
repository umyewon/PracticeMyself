package chap12.sec08.blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		// ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()  // ���� �� ���α׷��� �����ϴ� ��ǻ���� CPU�� �ھ��� �� ����
		); 
		
		System.out.println("[�۾� ó�� ��û]");
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
		
		// ���� ��ü (�ܺ� ��ü)
		Result result = new Result();
		
		// �ϳ��� ��ü�� �ΰ��� �۾��� ����
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		
		// task�� ó�� �Ϸ�� �� ���� ��� (���ŷ)
		try {
			// ���������� result�� ���� ��ü������ ������ ����� ���� �� ����
			result = future1.get();
			result = future2.get();
			System.out.println("[ó�� ���]" + result.accumValue);  // 55 + 55 = 110 
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			System.out.println("[���� ���� �߻���]" + e.getMessage());
		}  
	}
}

class Result{
	int accumValue;
	
	synchronized void addValue(int value) { // ���� ��ü�̱� ������ ����ȭ �޼ҵ�
		accumValue += value;
	}
}
