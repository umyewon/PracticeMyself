package com.kh.chap01_advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAttendingAdvice {

	/* throwing 속성의 이름과 매개변수의 이름이 동일해야함 */
	public void afterThrowingAttendingAdvice(JoinPoint joinPoint, Throwable exception) {	// 위에서 선언한 throwing과 동일한 매개변수명
		/* 조인 포인트로 처리할 수 있는 정보는 동일하며, exeception이 throws 된 경우에 동작함*/
		System.out.println("=================== after throwing attending ===================");
		System.out.println(exception.getMessage());
		System.out.println("=================================================================");
	}
}
