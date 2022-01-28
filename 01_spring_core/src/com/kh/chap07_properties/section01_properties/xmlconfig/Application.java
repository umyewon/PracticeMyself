package com.kh.chap07_properties.section01_properties.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.chap07_properties.common.Beverage;
import com.kh.chap07_properties.common.Bread;
import com.kh.chap07_properties.common.Product;
import com.kh.chap07_properties.common.ShoppingCart;

public class Application {

	public static void main(String[] args) {
		
		/* product-info.properties에 별도로 작성 된 properties 파일을 읽어서 bean 생성 시 설정 값으로 사용 */
		
		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap07_properties/section01_properties/xmlconfig/config/spring-context.xml");
	
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
	
	}

}
