package com.kh.chap01_connection.javaconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.chap01_connection.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context
			= new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		System.out.println("전체 메뉴 조회하기");
		
		MenuService menuService = context.getBean("menuService", MenuService.class);
		
		/* spring-tx(transaction) 라이브러리 추가 */
		List<Menu> menuList = menuService.selectMenuList();
		for(Menu menu : menuList) {
			System.out.println(menu);
		}
	}

}
