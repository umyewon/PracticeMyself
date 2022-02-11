package chap12.sec08.blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample  {

	public static void main(String[] args) {
		// ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()	// ���� �� ���α׷��� �����ϴ� ��ǻ���� CPU�� �ھ��� �� ����
		);
		
		// �۾� ó�� ��û
		System.out.println("[�۾� ó�� ��û]");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("[ó�� ���]" + sum);
			}
		};
		
		Future future = executorService.submit(runnable);  // ���� ���� ���� �۾� �Ϸ� �뺸
		
		try {
			 future.get();    // �����尡 �۾��� �Ϸ��ϱ� �������� get() �޼ҵ�� ���ŷ ��
			 System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			  System.out.println("[���� �߻���]" + e.getMessage());
		} 
		
		executorService.shutdown();
	}

}
