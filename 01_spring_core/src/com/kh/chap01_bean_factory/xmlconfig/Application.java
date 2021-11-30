package com.kh.chap01_bean_factory.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		/* BeanFactory : 스프링 컨테이너의 최상위 컨테이너. Bean의 생성과 설정, 관리 등의 역할 
		 * ApplicationContext : BeanFactory의 확장
		 * GenericXmlApplicationContext : XML 설정 파일을 읽어서 구동되는 실제 구현체
		 */
		
		ApplicationContext context 
			= new GenericXmlApplicationContext("com/kh/chap01_bean_factory/xmlconfig/spring-context.xml");  
												// 설정 파일 읽어올 수 있게 디렉토리 설정 (슬래시로 구분)
		
		/* context 생성 시 설정 정보를 읽어왔기 때문에 컨테이너는 bean으로 등록한 인스턴스를 
		 * 컨테이너의 라이프 사이클이 유지되는 동안 유지함 
		 * 컨테이너가 보관하고 있는 bean을 꺼내서 사용할 때 getBean() 메소드 이용
		 * */
		
		// 1. bean의 아이디 이용 (type 유추가 불가능하여 Object 타입으로 반환하므로 다운 캐스팅)
		//Member member = (Member)context.getBean("member");
		
		//2. bean의 클래스 메타 정보를 이용(가져오려는 타입이 명확하므로 형변환 불필요)
		// Member member = context.getBean(Member.class);
		
		// 3. bean의 id와 클래스 메타 정보를 전달
		Member member = context.getBean("member", Member.class);
		
		System.out.println(member);
		
		
		
	}

}
