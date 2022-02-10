package chap12.sec03.synchronizedd;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		// user1은 100이 아닌 50이 출력 됨 => 공유 객체 사용 시 주의할 점
		
	}

}
