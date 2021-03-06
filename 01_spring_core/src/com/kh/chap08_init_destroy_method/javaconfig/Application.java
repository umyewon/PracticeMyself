package com.kh.chap08_init_destroy_method.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.chap08_init_destroy_method.common.Beverage;
import com.kh.chap08_init_destroy_method.common.Bread;
import com.kh.chap08_init_destroy_method.common.Product;
import com.kh.chap08_init_destroy_method.common.ShoppingCart;
import com.kh.chap08_init_destroy_method.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {

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
		cart2.addItem(water);
		
		System.out.println("cart2에 담긴 물건 : " + cart2.getItems());
		
		System.out.println("cart1의 hashcode : " + cart1.hashCode());
		System.out.println("cart2의 hashcode : " + cart2.hashCode());
		
		/* init-method는 어떠한 설정을 하지 않아도 실행되는 순간 동작함 
		destroy-method는 설정을 하지 않으면 동작하지 않음*/
		
		/* 강제로 컨테이너를 종료시키면 폐기 메소드(destroy-method)가 동작하는 것을 확인할 수 있음*/
		((AnnotationConfigApplicationContext)context).close();	// 실제 구현 클래스로 context 다운 캐스팅 필요
		
	}

}
