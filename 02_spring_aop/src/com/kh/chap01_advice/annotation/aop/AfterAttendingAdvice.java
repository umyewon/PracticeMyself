package com.kh.chap01_advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.kh.chap01_advice.annotation.Passion;

@Component
@Aspect
public class AfterAttendingAdvice {
	// before attending과 차이점은 동작 타이밍 뿐
	
	@After("execution(* com.kh.chap01_advice.annotation..*(..))")
	public void afterAttending(JoinPoint joinPoint) {
		System.out.println("============ after attending ============");
		System.out.println("내일도 열심히 공부해야지!! 라는 마음으로 잠자리에 듭니다.");
		System.out.println("수강생 타입 : " + joinPoint.getTarget().getClass());	// 타겟 클래스의 정보
		System.out.println("수강생의 행위 : " + joinPoint.getSignature());			// 리턴 타입을 포함한 메소드 시그니처
		System.out.println("행위 요약 : " + joinPoint.getSignature().getName())	;	// 메소드명만 반환
		System.out.println("수강생의 열정 : " + ((Passion)joinPoint.getArgs()[0]).getScore());	// 매개변수
		System.out.println("================================================");
	}
	
	/* after의 경우 세분화하여 afterReturning, afterThrowing으로 처리 가능 
	 * afterReturning : 성공적으로 반환한 경우 (반환 값 참조 및 가공 가능)
	 * afterThrowing : Exception 던져진 경우 (Exception 참조 가능) 
	 * after : 성공/실패와 무관하게 메소드 실행 이후 동작함*/
	
}
