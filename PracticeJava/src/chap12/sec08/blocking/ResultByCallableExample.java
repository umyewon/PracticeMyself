package chap12.sec08.blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		// ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()	// ���� �� ���α׷��� �����ϴ� ��ǻ���� CPU�� �ھ��� �� ����
		);
		
		// �۾� ó�� ��û
		System.out.println("[�۾� ó�� ��û]");
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
		
		Future<Integer> future = executorService.submit(task);  // ���� ���� ���� �۾� �Ϸ� �뺸
		
		try {
			 int sum = future.get();    // �����尡 �۾��� �Ϸ��ϱ� �������� get() �޼ҵ�� ���ŷ ��
			 System.out.println("[ó�� ���] " + sum);
			 System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			  System.out.println("[���� �߻���]" + e.getMessage());
		} 
		
		executorService.shutdown();
	}

}
