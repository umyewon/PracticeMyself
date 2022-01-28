package com.kh.chap07_properties.section01_properties.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.chap07_properties.common.Beverage;
import com.kh.chap07_properties.common.Bread;
import com.kh.chap07_properties.common.Product;
import com.kh.chap07_properties.common.ShoppingCart;
import com.kh.chap07_properties.section01_properties.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {

		/* product-info.properties에 별도로 작성 된 properties 파일을 읽어서 bean 생성 시 설정 값으로 사용 
		 * properties 파일 사용했을 때 이점 : 여러가지 설정값을 코드에 별도로 작성하지 않고 프로퍼티 파일만 수정하면 됨 */
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
		
	}

}
