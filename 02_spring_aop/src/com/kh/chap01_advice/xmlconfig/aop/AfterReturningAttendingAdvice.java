package com.kh.chap01_advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;
import com.kh.chap01_advice.xmlconfig.AchievementResult;

public class AfterReturningAttendingAdvice {
	
	/* returning 속성은 리턴 값으로 받아올 오브젝트 매개변수 이름과 동일해야 함 
	 * 또한 joinPoing는 반드시 첫번째 매개변수로 선언해야 함*/
	public void afterReturningAttendingAdvice(JoinPoint joinPoint, Object result) {		// result는 해당 메소드가 성공적으로 수행됐을 때 돌아올 리턴값 위의 returning과 동일한 이름
		System.out.println("================= after returning attending =================");
		System.out.println("오늘의 이해도 : " + ((AchievementResult)result).getUnderstandingScore());		// 다운캐스팅 필요
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
