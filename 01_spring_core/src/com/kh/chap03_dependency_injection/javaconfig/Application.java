package com.kh.chap03_dependency_injection.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.chap03_dependency_injection.javaconfig.config.ContextConfiguration1;
import com.kh.chap03_dependency_injection.javaconfig.config.ContextConfiguration2;


public class Application {

	public static void main(String[] args) {
		ApplicationContext context 
		//	= new AnnotationConfigApplicationContext(ContextConfiguration1.class);
		    = new AnnotationConfigApplicationContext(ContextConfiguration2.class);
		
		Member member = context.getBean(Member.class);
		
		System.out.println(member);
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().deposit(100000));
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().withdraw(50000));
		System.out.println(member.getPersonalAccount().getBalance());
		
	}

}
