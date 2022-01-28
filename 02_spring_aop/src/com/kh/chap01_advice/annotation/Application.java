package com.kh.chap01_advice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {
		
		/* advice 종류별 테스트 */
		ApplicationContext context
			= new AnnotationConfigApplicationContext("com.kh.chap01_advice.annotation"); // 베이스 패키지 설정 
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		for(String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		System.out.println("================== NormalStudent ==================");
		Student normalStudent = context.getBean("normalStudent", Student.class);
		AchievementResult normalResult = normalStudent.study(new Passion(10));
		System.out.println("NormalStudent Result : " + normalResult);
		
		System.out.println("================== BestStudent ==================");
		Student bestStudent = context.getBean("bestStudent", Student.class);
		AchievementResult bestResult = bestStudent.study(new Passion(10));
		System.out.println("BestStudent Result : " + bestResult);
		
		
		
	}

}
