package chap10;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {  // 잔고가 인출금보다 적을 때
			throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + "원 부족");  // 예외 메시지
		}
		balance -= money;
	}

}
