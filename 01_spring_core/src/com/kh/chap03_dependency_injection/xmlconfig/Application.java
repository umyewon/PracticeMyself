package com.kh.chap03_dependency_injection.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap03_dependency_injection/xmlconfig/config/spring-context.xml");
		
		Member member = context.getBean(Member.class);
		System.out.println(member);
		
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().deposit(100000));
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().withdraw(50000));
		System.out.println(member.getPersonalAccount().getBalance());
	}

}
