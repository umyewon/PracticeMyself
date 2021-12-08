package com.kh.chap01_advice.annotation.aop;

import org.aspectj.lang.annotation.Pointcut;

public class StudentPointcut {

	// 다른 클래스에서 정의 된 포인트 컷을 사용할 수 있도록 접근 제어자 public 사용
	@Pointcut("execution(* com.kh.chap01_advice.annotation..*(..))")
	public void studyPointcut() {}
}
