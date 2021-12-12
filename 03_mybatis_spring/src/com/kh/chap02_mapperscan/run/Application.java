package com.kh.chap02_mapperscan.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.chap02_mapperscan.model.service.MenuService;
import com.kh.chap02_mapperscan.model.vo.Menu;


public class Application {

	public static void main(String[] args) {
		/* 마이바티스 스프링의 매퍼 스캔 기법 이용 */
		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap02_mapperscan/config/spring-context.xml");
		
		System.out.println("전체 메뉴 조회하기");
		
		MenuService menuService = context.getBean("menuService", MenuService.class);
		
		List<Menu> menuList = menuService.selectMenuList();
		
		for(Menu menu : menuList) {
			System.out.println(menu);
		}
	}

}
