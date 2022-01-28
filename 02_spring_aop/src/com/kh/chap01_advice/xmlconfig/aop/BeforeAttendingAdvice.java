package com.kh.chap01_advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;

import com.kh.chap01_advice.xmlconfig.Passion;

/* pointcut과 advice를 하나의 클래스 단위로 정의하기 위한 어노테이션 
 * aspectj runtime라이브러리 추가 필요 */

public class BeforeAttendingAdvice {

	/* 포인트 컷은 여러 조인 포인트를 매치하기 위해 지정한 표현식
	 * 이렇게 매치 된 조인 포인트에서 해야할 일이 advice 
	 * 매개변수로 전달한 JoinPoint 객체는 현재 조인 포인트의 메소드명, 인수 값 등의 자세한 정보를 액세스 할 수 있음 */
	
	public void beforeAttending(JoinPoint joinPoint) {
		// 요청 클래스 (Application- .study()) -> proxy -> 타겟 클래스 (NormalStudent | BestStudent)
		System.out.println("============= before attending =============");
		System.out.println("오늘도 신나게 zoom을 켜고 입실 QR을 찍는다.");
		System.out.println("수강생 타입 : " + joinPoint.getTarget().getClass());	// 타겟 클래스의 정보
		System.out.println("수강생의 행위 : " + joinPoint.getSignature());			// 리턴 타입을 포함한 메소드 시그니처
		System.out.println("행위 요약 : " + joinPoint.getSignature().getName())	;	// 메소드의 이름만 반환
		System.out.println("수강생의 열정 : " + ((Passion)joinPoint.getArgs()[0]).getScore());	// 매개변수
		System.out.println("================================================");
	}

}
