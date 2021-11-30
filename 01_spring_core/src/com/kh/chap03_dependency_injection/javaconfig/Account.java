package com.kh.chap03_dependency_injection.javaconfig;

public interface Account {

	/* 잔액 조회*/ 
	String getBalance();
	
	/* 입금 */
	String deposit(int money);
	
	/* 출금 */
	String withdraw(int money);
	
}
