package com.kh.chap06_bean_scope.section01_singleton.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.kh.chap06_bean_scope.common.Beverage;
import com.kh.chap06_bean_scope.common.Bread;
import com.kh.chap06_bean_scope.common.Product;
import com.kh.chap06_bean_scope.common.ShoppingCart;

@Configuration
public class ContextConfiguration {

		@Bean
		public Product carpBread() {
			return new Bread("붕어빵", 1000, new java.util.Date());
		}
		
		@Bean
		public Product milk() {
			return new Beverage("딸기우유", 1500, 500);
		}
		
		@Bean
		public Product water() {
			return new Beverage("지리산 암반수", 3000, 500);
		}
		
		@Bean
		@Scope("singleton")	// @Scope(singleton)이 기본값
		public ShoppingCart cart() {
			return new ShoppingCart();
		}
		
}
