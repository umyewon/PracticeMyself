package com.kh.chap01_bean_factory.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* AnnotationConfigApplicationContext : 어노테이션 설정 정보를 읽어와서 컨테이너 설정 
		 * 인자로 @Configuration 어노테이션이 달린 설정 클래스의 메타 정보를 전달하여 인스턴스 생성
		 * 
		 * Annotation을 이용한 방식은 대상 클래스의 요청을 가로채 처리하는 aop 기능을 이용하므로
		 * spring aop 모듈 추가가 필요함
		 * */
		ApplicationContext context
			= new AnnotationConfigApplicationContext(ContextConfiguration.class);	
		
		/* container를 생성하는 구현체만 다르고 사용하는 방법은 동일함 */
		// Member member = context.getBean("member", Member.class);
		// Member member = (Member)context.getBean("member");
		Member member = context.getBean(Member.class);
		
		System.out.println(member);
		
	}

}
