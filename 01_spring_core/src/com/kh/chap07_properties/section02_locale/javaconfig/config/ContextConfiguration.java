package com.kh.chap07_properties.section02_locale.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ContextConfiguration {

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {	// spring 내에 만들어져있는 클래스 사용
		
		/* 접속하는 세션의 locale에 따라 '자동으로' 재로딩하는 용도의 MessageSource 구현체 (따라서 파일명만 locale 명시해서 잘 작성하면 자동으로 로딩 해줌)*/
		ReloadableResourceBundleMessageSource messageSource
			= new ReloadableResourceBundleMessageSource();
		
		/* 다국어 메세지를 읽어 올 properties 파일의 기본 파일 이름을 설정 */
		messageSource.setBasename("message");
		/* 기본 인코딩 셋을 설정 */
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
	}
	
}

