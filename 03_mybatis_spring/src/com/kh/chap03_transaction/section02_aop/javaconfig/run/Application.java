package com.kh.chap03_transaction.section02_aop.javaconfig.run;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.chap03_transaction.section02_aop.javaconfig.model.service.OrderService;
import com.kh.chap03_transaction.section02_aop.javaconfig.model.vo.Order;
import com.kh.chap03_transaction.section02_aop.javaconfig.model.vo.OrderMenu;

public class Application {

	public static void main(String[] args) throws Exception {
		/* AOP를 적용한 트랜잭션 관리 (annotation 설정) */
		
		ApplicationContext context 
			= new GenericXmlApplicationContext("com/kh/chap03_transaction/section02_aop/javaconfig/config/spring-context.xml");
		
		OrderService orderService = context.getBean("orderService", OrderService.class);
		
		Scanner sc = new Scanner(System.in);
		
		List<OrderMenu> orderMenuList = new ArrayList<>();
		
		do {
			System.out.println("=================== 레스토랑 음식 주문 서비스 ===================");
			System.out.print("어떤 메뉴를 주문하시겠습니까?(코드입력) : ");
			int menuCode = sc.nextInt();
			System.out.print("주문 수량을 입력해주세요 : ");
			int amount = sc.nextInt();
			sc.nextLine();
			System.out.print("다른 메뉴를 추가로 주문하시겠습니까 ? (Y/N) : ");
			char continueYN = sc.nextLine().toUpperCase().charAt(0);
			
			OrderMenu orderMenu = new OrderMenu();		// 입력 받은 메뉴와 수량을 orderMenu에 담고
			orderMenu.setMenuCode(menuCode);
			orderMenu.setAmount(amount);
			
			orderMenuList.add(orderMenu);		// orderMenu를 List에 담음
		
			if(continueYN != 'Y') break;
			
		} while(true);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		Order order = new Order();
		order.setDate(dateFormat.format(new Date()));		// util Date 임포트
		order.setTime(timeFormat.format(new Date()));
		order.setMenuList(orderMenuList);
		
		/* 총 주문 가격은 제외. 트랜젝션 처리에 초점을 맞춰서 확인.*/
		System.out.println(order);
		
		int result = orderService.registOrder(order);
		
		if(result > 0) {
			System.out.println("메뉴 주문에 성공하셨습니다.");
		} else {
			System.out.println("메뉴 주문에 실패하셨습니다.");
		}
		
		
	}

}
