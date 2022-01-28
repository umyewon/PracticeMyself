package com.kh.chap03_transaction.section01_programmatic.model.service;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.kh.chap03_transaction.section01_programmatic.model.dao.OrderMapper;
import com.kh.chap03_transaction.section01_programmatic.model.vo.Order;
import com.kh.chap03_transaction.section01_programmatic.model.vo.OrderMenu;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	private SqlSessionTemplate sqlSession;
	
	/* 트랜잭션 추가 시 작성 */
	private DataSourceTransactionManager transactionManager;
	
	@Autowired	// 생성자 주입
	public OrderServiceImpl(SqlSessionTemplate sqlSession, DataSourceTransactionManager transactionManager) {
		this.sqlSession = sqlSession;
		this.transactionManager = transactionManager;
	}
	
	@Override	// 주문 등록 기능 (트랜잭션 처리x)
	public int registOrder(Order order) {
		// OrderMapper는 dao에 해당
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		
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
			/* 스프링으로 SqlSession을 관리할 때 직접 호출하면 UnsupportedOperationException 발생 */
			sqlSession.commit();	
		} else {
			sqlSession.rollback();
		}
 		
		return result;
	}

	@Override // 주문 등록 기능 (트랜잭션 처리o)
	public int registOrder2(Order order) {
		/* 동일한 주문 등록 로직에 트랜잭션 추가하기
		 * spring-context.xml에 트랜잭션을 처리하는 트랜잭션 매니저를 bean으로 추가
		 * 필드 값으로 선언, 생성자 주입 작성 */
		
		/* 트랜잭션에 대한 설정 정보를 담고있는 객체 */
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		
		/* 전파 행위 옵션 설정 
		 * REQUIRED : 진행 중인 트랜잭션이 있으면 현재 메소드를 그 트랜잭션에서 실행하되 그렇지 않은 경우 새 트랜잭션을 시작해서 실행함 
		 * 			  (트랜잭션이 하나의 기능 단위로 실행되어야 할 때 사용 -- 따라서,주로 required 사용)
		 * REQUIRED_NEW : 항상 새 트랜잭션을 시작해 메소드를 실행하고 진행중인 트랜잭션이 있으면 잠시 중단 시킴
		 * SUPPORTS : 진행중인 트랜잭션이 있으면 현재 메소드를 그 트랜잭션 내에서 실행하되, 그렇지 않을 경우 트랜잭션 없이 실행함
		 * NOT_SUPPORTED : 트랜잭션 없이 현재 메소드를 실행하고 진행 중인 트랜잭션이 있으면 잠시 중단함
		 * MANDATORY : 반드시 트랜잭션을 걸고 현재 메소드를 실행하되 진행중인 트랜잭션이 없으면 예외를 던짐
		 * NEVER : 반드시 트랜잭션 없이 현재 메소드를 실행하되 진행 중인 트랜잭션이 있으면 예외를 던짐
		 * NESTED : 진행 중인 트랜잭션이 있으면 현재 메소드를 이 트랜잭션의 중첩 트랜잭션 내에서 실행
		 * 			진행 중인 트랜잭션이 없으면 새 트랜잭션을 실행
		 * 			배치 실행 시 처리 업무가 백만개라고 하면 10만개씩 끊어서 커밋하는 경우 중간에 잘못 되어도 중첩 트랜잭션을
		 * 			롤백하면 전체가 아닌 10만개만 롤백 (세이브 포인트 이용하는 방식)
		 * */
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		/* 격리 레벨 (동시성 고려) 
		 * DEFAULT : DB의 기본 격리 수준을 사용. 대다수는 READ_COMMITED가 기본 격리 수준.
		 * READ_UNCOMMITED : 다른 트랜잭션이 아직 커밋하지 않은 값을 또 다른 트랜잭션이 읽을 수 있음
		 * 					  따라서 오염된 값을 읽거나, 재현 불가능한 읽기, 허상 읽기 등의 문제 발생 가능
		 * READ_COMMITED : 트랜잭션이 다른 트랜잭션에서 커밋한 값만 읽을 수 있음
		 * 				      오염된 값 읽기 문제는 해결되지만 재현 불가능한 읽기 및 허상 읽기는 여전히 발생 가능
		 * REPEATABLE_READ : 트랜잭션이 어떤 필드를 여러번 읽어도 동일한 값을 읽도록 보장
		 * 					  트랜잭션이 지속되는 동안  다른 트랜잭션이 해당 필드 변경 불가능
		 * 					  오염된 값 일기, 재현 불가능한 읽기는 해결 되지만, 허상 읽기는 여전히 발생 가능
		 * SERIALIZABLE : 트랜잭션 테이블을 여러번 읽어도 정확히 동일한 로우를 읽도록 보장
		 * 				    트랜잭션이 지속되는 동안에는 다른 트랜잭션이 해당 테이블에 삽입, 수정, 삭제를 할 수 없음
		 * 				    동시성 문제는 모두 해소 되지만 성능은 현저하게 떨어짐
		 * 
		 * 
		 * 오염된 값 : 하나의 트랜잭션이 데이터를 변경 후 잠시 기다리는 동안 다른 트랜잭션이 데이터를 읽게 되면
		 * 			 격리 레벨 READ_UNCOMMITED인 경우 아직 변경 후 커밋하지 않은 재고 값을 그대로 읽게 됨
		 * 			 그러나 처음 트랜잭션이 데이터를 롤백하게 되면 다른 트랜잭션이 읽은 값은 더 이상 유효하지 않은 일시적인 값이 되는데
		 * 			 이를 오염된 값이라고 함
		 * 재현 불가능한 읽기 : 처음 트랜잭션이 데이터를 수정하면 수정이 되고 아직 커밋되지 않은 로우에 수정 잠금을 걸게 됨
		 * 				     다른 트랜잭션은 이 트랜잭션이 커밋 혹은 롤백을 통해 수정 잠금이 풀릴 때까지 기다렸다가 읽어야 함 
		 * 				     하지만 다른 로우에 대해서는 또 다른 트랜잭션이 데이터를 수정하고 커밋하게 되면
		 * 				     가장 처음 동작한 트랜잭션이 데이터를 커밋하고 다시 조회할 경우 처음 읽은 그 값이 아니게 되는데
		 * 				     이를 재현 불가능한 읽기라고 함
		 * 허상 읽기 : 처음 트랜잭션이 테이블에서 여러 로우를 읽은 후 다른 트랜잭션이 같은 테이블의 로우를 추가하는 경우
		 * 			처음 트랜잭션이 같은 테이블을 다시 읽으면 처음 읽었을 때와 달리 새로 추가된 로우가 있게 되는데
		 * 			이를 허상 읽기라고 함(재현 불가능한 읽기와 유사하지만 허상 읽기는 여러 로우가 추가되는 경우를 말함)
		 * */
		def.setIsolationLevel(DefaultTransactionDefinition.ISOLATION_SERIALIZABLE);
		
		/* TransactionStatus : 트랜잭션에 대한 실행을 제어하거나, 트랜잭션 상태 등을 조회할 수 있는 방법을 제공하는 객체 */
		TransactionStatus status = transactionManager.getTransaction(def);
		 
		/* 트랜잭션을 수동으로 할 수 있도록 설정 */
		try {
			sqlSession.getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 트랜잭션 처리 전과 동일한 코드 작성
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

		/* order table insert */
		int orderResult = orderMapper.insertOrder(order);

		/* order menu table insert */
		int orderMenuResult = 0;
		List<OrderMenu> orderMenuList = order.getMenuList(); // 여러개의 메뉴를 주문할 수 있기 때문에 run에서 넘어온 order객체의 menuList를 가져와서
		for (OrderMenu orderMenu : orderMenuList) { // 반복문 수행
			orderMenuResult += orderMapper.insertOrderMenu(orderMenu); // 합산된 insert 결과가 result에 쌓임
		}

		int result = 0;
		if (orderResult > 0 && orderMenuResult == orderMenuList.size()) { // 주문 받은 메뉴개수와 ordermenu테이블에 인서트 된 개수가 동일하다면
			result = 1;
			/* transactionManager 객체에 TransactionStatus를 전달하여 commit/rollback */
			transactionManager.commit(status);
		} else {
			transactionManager.rollback(status);
		}

		return result;
	}

}
