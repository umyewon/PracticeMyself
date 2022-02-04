package chap10;

public class BalanceInsufficientException extends Exception{ // 일반 예외
	
	public BalanceInsufficientException() {} // 기본 생성자
	public BalanceInsufficientException( String message ) {
		super(message);
	}
}
