package chap10;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 출금하기
		try {
			// 예외 발생시키기
			account.withdraw(30000);
			System.out.println("예금액 : " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			System.out.println(e.toString());
			
			System.out.println();
			e.printStackTrace(); 	// 개발 단계에서만 사용하고 배포 시 제거하는 것이 권장됨
		}
	}

}
