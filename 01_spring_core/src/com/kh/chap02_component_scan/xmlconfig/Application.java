package com.kh.chap02_component_scan.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context
		//	= new GenericXmlApplicationContext("com/kh/chap02_component_scan/xmlconfig/config/spring-context1.xml");
			= new GenericXmlApplicationContext("com/kh/chap02_component_scan/xmlconfig/config/spring-context2.xml");
		
		/* Bean으로 등록된 name 출력 확인 */
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		MemberDao memberDao = context.getBean(MemberDao.class);
		
		System.out.println(memberDao.selectMember(1));
		System.out.println(memberDao.insertMember(new Member(3, "user03", "pass03", "새로운 멤버")));
		System.out.println(memberDao.selectMember(3));
		
		
	}

}
