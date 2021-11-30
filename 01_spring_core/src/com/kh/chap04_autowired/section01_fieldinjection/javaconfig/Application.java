package com.kh.chap04_autowired.section01_fieldinjection.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		/* @Autowired를 이용한 의존성 주입
		 * : 어노테이션을 이용한 bean 생성 및 의존성 주입을 제공
		 * 어노테이션 방식을 이용하면 지금까지 본 생성자 주입, setter 주입 외에도 필드 주입을 추가적으로 할 수 있음*/
		
		/* 베이스 패키지 매개변수로 하여 context 생성 */
		ApplicationContext context
			= new AnnotationConfigApplicationContext("com.kh.chap04_autowired.section01_fieldinjection.javaconfig");
		
		/* 생성 된 bean 조회 */
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		BookService bookService = context.getBean("bookService", BookService.class);
		/* 전체 목록 조회 */
		for(Book b : bookService.selectAllBooks()) {
			System.out.println(b);
		}
		
		/* 시퀀스로 조회 */
		System.out.println(bookService.searchBookBySequence(2));
	}

}
