package chap10;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		
		// ����ϱ�
		try {
			// ���� �߻���Ű��
			account.withdraw(30000);
			System.out.println("���ݾ� : " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			System.out.println(e.toString());
			
			System.out.println();
			e.printStackTrace(); 	// ���� �ܰ迡���� ����ϰ� ���� �� �����ϴ� ���� �����
		}
	}

}
