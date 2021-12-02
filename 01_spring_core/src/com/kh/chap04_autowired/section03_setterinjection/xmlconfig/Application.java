package com.kh.chap04_autowired.section03_setterinjection.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {

	public static void main(String[] args) {

		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap04_autowired/section03_setterinjection/xmlconfig/config/spring-context.xml");
	
	
	MakeRandomString randomString = context.getBean(MakeRandomString.class);
		
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		System.out.println(randomString.getRandomLengthString());
		
	}

}
