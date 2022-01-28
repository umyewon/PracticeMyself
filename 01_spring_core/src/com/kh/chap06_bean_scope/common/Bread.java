package com.kh.chap06_bean_scope.common;

import java.util.Date;

public class Bread extends Product{

	private Date bakedDate;
	
	public Bread() {}

	public Bread(String name, int price, Date bakedDate) {
		super(name, price);
		this.bakedDate = bakedDate;
	}

	public Date getBakedDate() {
		return bakedDate;
	}

	public void setBakedDate(Date bakedDate) {
		this.bakedDate = bakedDate;
	}

	@Override
	public String toString() {
		return super.toString() + " " + bakedDate;
	}
	
	
	
}
