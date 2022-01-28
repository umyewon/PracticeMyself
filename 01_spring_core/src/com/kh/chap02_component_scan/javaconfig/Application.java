package com.kh.chap02_component_scan.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kh.chap02_component_scan.javaconfig.config.ContextConfiguration1;
import com.kh.chap02_component_scan.javaconfig.config.ContextConfiguration2;
import com.kh.chap02_component_scan.javaconfig.config.ContextConfiguration3;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context 
			// = new AnnotationConfigApplicationContext(ContextConfiguration1.class);
		    //	= new AnnotationConfigApplicationContext(ContextConfiguration2.class);
				= new AnnotationConfigApplicationContext(ContextConfiguration3.class);
		
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
