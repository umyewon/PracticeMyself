package com.kh.chap03_transaction.section02_aop.javaconfig.model.service;

import com.kh.chap03_transaction.section02_aop.javaconfig.model.vo.Order;

public interface OrderService {

	/* 주문 등록 기능 */
	int registOrder(Order order) throws Exception;
}
