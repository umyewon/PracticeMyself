package com.kh.chap01_advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.kh.chap01_advice.annotation.AchievementResult;

@Component
@Aspect
public class AfterReturningAttendingAdvice {
	
	/* returning 속성은 리턴 값으로 받아올 오브젝트 매개변수 이름과 동일해야 함 
	 * 또한 pointcut은 반드시 첫번째 매개변수로 선언해야 함*/
	//@AfterReturning(pointcut="execution(* com.kh.chap01_advice.annotation..*(..))", returning="result")
	@AfterReturning(pointcut="StudentPointcut.studyPointcut()", returning="result")
	public void afterReturningAttendingAdvice(JoinPoint joinPoint, Object result) {		
		/* 매개변수의 Object는 해당 메소드가 성공적으로 수행됐을 때 돌아올 리턴값으로
		 어노테이션 속성으로 정의한 returning과 동일한 이름의 변수명 사용 */
		System.out.println("================= after returning attending =================");
		System.out.println("오늘의 이해도 : " + ((AchievementResult)result).getUnderstandingScore());		// 실 구현 클래스로 다운캐스팅 필요
		System.out.println("오늘의 만족도 : " + ((AchievementResult)result).getSatisfactionScore());
		/* setter를 사용해서 리턴할 결과 값을 변경해 줄 수도 있음*/
		double employeementRate = ((AchievementResult)result).getEmployeementRate();
		double percent = employeementRate / 1000.0 * 100;
		/* 1000점 만점을 백분율로 환산해서 퍼센트 변환 */
		System.out.println("증가 된 취업률 : " + percent + "%");
		((AchievementResult)result).setEmployeementRate(percent);
		System.out.println("==========================================================================");
		
	}
}
