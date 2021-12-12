package com.kh.chap03_transaction.section01_programmatic.model.service;

import com.kh.chap03_transaction.section01_programmatic.model.vo.Order;

public interface OrderService {

	/* 주문 등록 기능 */
	int registOrder(Order order);

	/* 주문 등록 (트랜잭션 적용) */
	int registOrder2(Order order);
}
