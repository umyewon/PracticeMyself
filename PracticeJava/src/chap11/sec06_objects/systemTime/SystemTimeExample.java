package chap11.sec06_objects.systemTime;

public class SystemTimeExample {

	public static void main(String[] args) {
		//long time1 = System.nanoTime();
		long time1 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i = 1; i <= 10000000; i++) {
			sum += 1;
		}
		
		//long time2 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		System.out.println("1~10000000 까지의 합 = " + sum);
		System.out.println("계산에 " + (time2 - time1)  + "밀리초가 소요되었습니다.");
	}

}
