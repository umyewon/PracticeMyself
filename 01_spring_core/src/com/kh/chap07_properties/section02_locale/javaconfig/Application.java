package com.kh.chap07_properties.section02_locale.javaconfig;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.chap07_properties.section02_locale.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {

		/* 소프트웨어의 국제화  => 다국어 메세지 처리*/
		ApplicationContext context
			= new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		// String error404Message = context.getMessage("error.404", null, Locale.US);	
		// => 파라미터 : "키 값", null(프로퍼티에 전달할 값 있을 때 작성, 없으면 null), locale
		String error404Message = context.getMessage("error.404", null, Locale.KOREA);
		
		//String error500Message = context.getMessage("error.500", new Object[] {"yewon", new Date()}, Locale.US);	
		// 프로퍼티 파일에서 어퍼스트로피(')는 이스케이핑 처리 되므로 두번 작성
		String error500Message = context.getMessage("error.500", new Object[] {"예원", new Date()}, Locale.KOREA);
		
		System.out.println("The message for error.404 : " + error404Message);
		System.out.println("The message for error.500 : " + error500Message);
		
	}

}
