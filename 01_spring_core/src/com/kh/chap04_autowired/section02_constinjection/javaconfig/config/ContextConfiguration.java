package com.kh.chap04_autowired.section02_constinjection.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kh.chap04_autowired.section02_constinjection.javaconfig.RandomGenerator;
import com.kh.chap04_autowired.section02_constinjection.javaconfig.RandomNumberGenerator;

@Configuration
@ComponentScan("com.kh.chap04_autowired.section02_constinjection.javaconfig")
public class ContextConfiguration {
	
	@Bean
	public RandomGenerator randomGenerator() throws Exception {
		return new RandomNumberGenerator(1, 10);		// 생성자 이용한 bean 값 설정
	}  
}
