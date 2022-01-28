package com.kh.chap04_autowired.section03_setterinjection.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kh.chap04_autowired.section03_setterinjection.javaconfig.RandomGenerator;
import com.kh.chap04_autowired.section03_setterinjection.javaconfig.RandomNumberGenerator;

@Configuration
@ComponentScan("com.kh.chap04_autowired.section03_setterinjection.javaconfig")
public class ContextConfiguration {
	
	@Bean
	public RandomGenerator randomGenerator() throws Exception {
		return new RandomNumberGenerator(1, 10);		// 생성자 이용한 bean 값 설정
	}  
}
