package chap12.sec05.stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		/*
		 * try { while(true) { System.out.println("실행 중");
		 * 
		 * Thread.sleep(1); 
		 * //interrupted 메소드로 안전하게 종료하기 위해 아주 짧은 시간동안 일시정지시킴 => 
		 * // InterruptedException 발생돼서 run()이 종료됨 
		 * // ==> 고의적으로 정지 시키는 것은 좋지 못한 코드임 따라서
		 * Thread.interrupted() 또는 isInterrupted() 메소드 사용 } } catch
		 * (InterruptedException e) { System.out.println("자원 정리");
		 * System.out.println("실행 종료"); }
		 */
		
		// 방법 1
		/*
		 * while(true) { System.out.println("실행 중"); 
		 * if(Thread.interrupted()) { //
		 * interrupt() 메소드가 호출 되면 true 리턴함 break; } } System.out.println("자원 정리");
		 * System.out.println("실행 종료");
		 */
		
		// 방법 2
		while(true) { 
			System.out.println("실행 중"); 
			if(isInterrupted()) { 
				// interrupt() 메소드가 호출 되면 true 리턴함
				break; 
			} 
		} 
			System.out.println("자원 정리");
			System.out.println("실행 종료");
	}
}