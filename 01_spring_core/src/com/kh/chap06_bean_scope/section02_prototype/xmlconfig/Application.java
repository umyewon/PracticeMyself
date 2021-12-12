package com.kh.chap06_bean_scope.section02_prototype.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.chap06_bean_scope.common.Beverage;
import com.kh.chap06_bean_scope.common.Bread;
import com.kh.chap06_bean_scope.common.Product;
import com.kh.chap06_bean_scope.common.ShoppingCart;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap06_bean_scope/section02_prototype/xmlconfig/config/spring-context.xml");
	
		Product carpBread = context.getBean("carpBread", Bread.class);
		Product milk = context.getBean("milk", Beverage.class);
		Product water = context.getBean("water", Beverage.class);
		
		ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
		cart1.addItem(carpBread);
		cart1.addItem(milk);
		
		System.out.println("cart1에 담긴 물건 : " + cart1.getItems());
		// 붕어빵, 우유 담겨있음
		
		ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
		// 새로운 ShoppingCart bean 인스턴스 생성
		cart2.addItem(water);
		
		System.out.println("cart2에 담긴 물건 : " + cart2.getItems());
		// 물만 담겨있음 => cart1에 담은 물건이 담겨있지 않고 cart2는 cart1가 분리된 다른 개체임 
		
		System.out.println("cart1의 hashcode : " + cart1.hashCode());
		System.out.println("cart2의 hashcode : " + cart2.hashCode());
		// => cart1과 cart2의 해시코드 다름 => 다른 개체임 (prototype)
	
	
	}

}
