package chap10;

public class BalanceInsufficientException extends Exception{ // �Ϲ� ����
	
	public BalanceInsufficientException() {} // �⺻ ������
	public BalanceInsufficientException( String message ) {
		super(message);
	}
}
