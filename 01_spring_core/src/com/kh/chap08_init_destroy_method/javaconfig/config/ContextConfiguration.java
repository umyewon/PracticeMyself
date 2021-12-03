package com.kh.chap08_init_destroy_method.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.kh.chap08_init_destroy_method.common.Beverage;
import com.kh.chap08_init_destroy_method.common.Bread;
import com.kh.chap08_init_destroy_method.common.Product;
import com.kh.chap08_init_destroy_method.common.ShoppingCart;
import com.kh.chap08_init_destroy_method.javaconfig.Owner;


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
		@Scope("prototype")	// singleton -> prototype으로 변경
		public ShoppingCart cart() {
			return new ShoppingCart();
		}
		
		@Bean(initMethod="openShop", destroyMethod="closeShop")
		public Owner owner() {
			return new Owner();
		}
		
}
