package com.kh.chap03_transaction.section02_aop.javaconfig.model.vo;

public class OrderMenu {
	
	private int code;
	private int menuCode;
	private int amount;
	
	public OrderMenu() {}

	public OrderMenu(int code, int menuCode, int amount) {
		super();
		this.code = code;
		this.menuCode = menuCode;
		this.amount = amount;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(int menuCode) {
		this.menuCode = menuCode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderMenu [code=" + code + ", menuCode=" + menuCode + ", amount=" + amount + "]";
	}
	
}
