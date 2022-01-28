package com.kh.chap03_transaction.section02_aop.javaconfig.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kh.chap03_transaction.section02_aop.javaconfig.model.dao.OrderMapper;
import com.kh.chap03_transaction.section02_aop.javaconfig.model.vo.Order;
import com.kh.chap03_transaction.section02_aop.javaconfig.model.vo.OrderMenu;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
	// SqlSessionTemplate 사용할 필요 없어서 OrderMapper를 필드에서 선언 후 주입=> config 파일에서 빈등록 했기때문에 가능
	private OrderMapper orderMapper;
	
	@Autowired	// 생성자 주입
	public OrderServiceImpl(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	
	/* @Transactional : 메소드 레벨에서는 어노테이션이 작성된 메소드만 트랜잭션 처리를 함
	 * 					클래스 레벨에 작성하면 모든 public 메소드에 적용 됨 
	 * 					스프링 트랜잭션 처리는 보통 이 방식으로 함 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE,
					rollbackFor= {Exception.class})		
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
