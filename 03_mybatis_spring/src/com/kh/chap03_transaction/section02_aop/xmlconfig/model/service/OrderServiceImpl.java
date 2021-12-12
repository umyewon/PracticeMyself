package com.kh.chap03_transaction.section02_aop.xmlconfig.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;

import com.kh.chap03_transaction.section02_aop.xmlconfig.model.dao.OrderMapper;
import com.kh.chap03_transaction.section02_aop.xmlconfig.model.vo.Order;
import com.kh.chap03_transaction.section02_aop.xmlconfig.model.vo.OrderMenu;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
	// SqlSessionTemplate 사용할 필요 없어서 OrderMapper를 필드에서 선언 후 주입=> config 파일에서 빈등록 했기때문에 가능
	private OrderMapper orderMapper;
	
	@Autowired	// 생성자 주입
	public OrderServiceImpl(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	
	@Override	// 주문 등록 기능
	public int registOrder(Order order) throws Exception {
		
		/* order table insert */
		int orderResult = orderMapper.insertOrder(order);
		
		/* order menu table insert */
		int orderMenuResult = 0;
		List<OrderMenu> orderMenuList = order.getMenuList();		// 여러개의 메뉴를 주문할 수 있기 때문에 run에서 넘어온 order객체의 menuList를 가져와서
		for(OrderMenu orderMenu : orderMenuList) {	// 반복문 수행
			orderMenuResult += orderMapper.insertOrderMenu(orderMenu);		// 합산된 insert 결과가 result에 쌓임
		}
		
		int result = 0;
		if(orderResult > 0 && orderMenuResult == orderMenuList.size()) {	// 주문 받은 메뉴개수와 ordermenu테이블에 인서트 된 개수가 동일하다면
			result = 1;
			
			
			throw new Exception("테스트를 위해 Exception 발생");
		} 
 		
		return result;
	}


}
