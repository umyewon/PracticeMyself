package com.kh.chap03_transaction.section01_programmatic.model.dao;

import com.kh.chap03_transaction.section01_programmatic.model.vo.Order;
import com.kh.chap03_transaction.section01_programmatic.model.vo.OrderMenu;

public interface OrderMapper {

	/* order table insert */
	int insertOrder(Order order);
	
	/* order menu table insert */
	int insertOrderMenu(OrderMenu orderMenu);
}
