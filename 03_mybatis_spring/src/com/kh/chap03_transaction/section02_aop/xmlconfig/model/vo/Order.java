package com.kh.chap03_transaction.section02_aop.xmlconfig.model.vo;

import java.util.List;

public class Order {

	private int code;
	private String date;
	private String time;
	private int totalPrice;
	private List<OrderMenu> menuList;
	
	public Order() {}

	public Order(int code, String date, String time, int totalPrice, List<OrderMenu> menuList) {
		super();
		this.code = code;
		this.date = date;
		this.time = time;
		this.totalPrice = totalPrice;
		this.menuList = menuList;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<OrderMenu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<OrderMenu> menuList) {
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		return "Order [code=" + code + ", date=" + date + ", time=" + time + ", totalPrice=" + totalPrice
				+ ", menuList=" + menuList + "]";
	}
	
	
}
