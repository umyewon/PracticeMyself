package com.kh.chap06_bean_scope.section01_singleton.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.chap06_bean_scope.common.Beverage;
import com.kh.chap06_bean_scope.common.Bread;
import com.kh.chap06_bean_scope.common.Product;
import com.kh.chap06_bean_scope.common.ShoppingCart;
import com.kh.chap06_bean_scope.section01_singleton.javaconfig.config.ContextConfiguration;


public class Application {

	public static void main(String[] args) {
		
		/* 현재 bean 구성은 singleton으로 설정 되어 있음 (default)
		 * singleton은 IoC 컨테이너 당 하나의 인스턴스만 생성
		 * 
		 * * 스프링의 bean 스코프 * 
		 * singleton 		IoC 컨테이너 당 bean 인스턴스를 하나 생성 (기본값)
		 * prototype 		요청할 때마다 bean 인스턴스를 새로 생성
		 * request			HTTP 요청 당 하나의 bean 인스턴스 생성 (웹 애플리케이션 컨텍스트만 해당)
		 * session			HTTP 세션 하나 당 하나의 bean 인스턴스를 생성 (웹 애플리케이션 컨텍스트만 해당)
		 * */
		
		ApplicationContext context
			= new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		
		Product carpBread = context.getBean("carpBread", Bread.class);
		Product milk = context.getBean("milk", Beverage.class);
		Product water = context.getBean("water", Beverage.class);
		
		ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
		cart1.addItem(carpBread);
		cart1.addItem(milk);
		
		System.out.println("cart1에 담긴 물건 : " + cart1.getItems());
		
		ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
		// 새로운 ShoppingCart bean인스턴스가 아닌 cart1과 동일한 bean 인스턴스
		cart2.addItem(water);
		
		System.out.println("cart2에 담긴 물건 : " + cart2.getItems());
		// => cart1에 담은 물건도 담겨있음 
		
		System.out.println("cart1의 hashcode : " + cart1.hashCode());
		System.out.println("cart2의 hashcode : " + cart2.hashCode());
		// => cart1과 cart2의 해시코드 동일함 => 이름만 다를뿐 같은 개체임 (sigleton)
	}

}
