package com.kh.chap03_transaction.section02_aop.xmlconfig.model.dao;

import com.kh.chap03_transaction.section02_aop.xmlconfig.model.vo.Order;
import com.kh.chap03_transaction.section02_aop.xmlconfig.model.vo.OrderMenu;

public interface OrderMapper {

	/* order table insert */
	int insertOrder(Order order);
	
	/* order menu table insert */
	int insertOrderMenu(OrderMenu orderMenu);
}
