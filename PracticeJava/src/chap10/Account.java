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
		if(balance < money) {  // �ܰ� ����ݺ��� ���� ��
			throw new BalanceInsufficientException("�ܰ� ���� : " + (money - balance) + "�� ����");  // ���� �޽���
		}
		balance -= money;
	}

}
