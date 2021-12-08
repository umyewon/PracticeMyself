package com.kh.chap01_advice.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {
		/* advice 종류별 테스트 */
		ApplicationContext context
			= new GenericXmlApplicationContext("com/kh/chap01_advice/xmlconfig/config/spring-context.xml");
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		for(String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		System.out.println("================== NormalStudent ==================");
		Student normalStudent = context.getBean("normalStudent", NormalStudent.class);
		AchievementResult normalResult = normalStudent.study(new Passion(10));
		System.out.println("NormalStudent Result : " + normalResult);
		
		System.out.println("================== BestStudent ==================");
		Student bestStudent = context.getBean("bestStudent", BestStudent.class);
		AchievementResult bestResult = bestStudent.study(new Passion(10));
		System.out.println("BestStudent Result : " + bestResult);
		
		
		
	}

}
