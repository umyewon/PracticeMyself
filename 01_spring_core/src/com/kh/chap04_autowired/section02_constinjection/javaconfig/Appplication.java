package com.kh.chap04_autowired.section02_constinjection.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.chap04_autowired.section02_constinjection.javaconfig.config.ContextConfiguration;

public class Appplication {

	public static void main(String[] args) {
		ApplicationContext context
			= new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		MakeRandomString randomString = context.getBean(MakeRandomString.class);
		
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		
		
	}

}
