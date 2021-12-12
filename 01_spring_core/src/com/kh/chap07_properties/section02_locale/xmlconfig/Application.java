package com.kh.chap07_properties.section02_locale.xmlconfig;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap07_properties/section02_locale/xmlconfig/config/spring-context.xml");
		
		// getMessage(파라미터) : "키 값", null(프로퍼티에 전달할 값 있을 때 작성, 없으면 null), locale
		 String error404Message = context.getMessage("error.404", null, Locale.US);	
		// String error404Message = context.getMessage("error.404", null, Locale.KOREA);
		
		// 프로퍼티 파일에서 {0}{1}로 작성했던 값을 두번째 매개변수로 값 전달
		String error500Message = context.getMessage("error.500", new Object[] {"yewon", new Date()}, Locale.US);	
		// 프로퍼티 파일에서 어퍼스트로피(')는 이스케이핑 처리 되므로 두번 작성
		// String error500Message = context.getMessage("error.500", new Object[] {"예원", new Date()}, Locale.KOREA);
		
		System.out.println("The message for error.404 : " + error404Message);
		System.out.println("The message for error.500 : " + error500Message);
	}

}
