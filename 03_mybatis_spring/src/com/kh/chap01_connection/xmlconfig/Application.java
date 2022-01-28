package com.kh.chap01_connection.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		/* javaconfig와 동일한 기능을 xml로 처리 테스트 */
		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap01_connection/xmlconfig/config/spring-context.xml");
		
		System.out.println("전 메뉴 조회하기");
		
		MenuService menuService = context.getBean("menuService", MenuService.class);
		
		List<Menu> menuList = menuService.selectMenuList();
		
		for(Menu menu : menuList) {
			System.out.println(menu);
		}
	}

}
