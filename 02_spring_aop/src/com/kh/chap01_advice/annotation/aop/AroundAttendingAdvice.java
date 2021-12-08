package com.kh.chap01_advice.annotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.kh.chap01_advice.annotation.BestStudent;

@Component
@Aspect
// @Order(value=2) 여러 어드바이스 사용 시 @Order 어노테이션으로 순서 지정 가능 (낮은 순서 일수록 먼저 컨트롤)
public class AroundAttendingAdvice {
	
	/* Around Advice는 가장 강력한 어드바이스로 조인 포인트를 완전히 장악하기 떄문에
	 * 앞에서 살펴 본 어드바이스 모두 Around Advice로 조합할 수 있으며
	 * 원본 조인 포인트를 언제 실행할지, 실행 자체를 안 할지 여부도 제어 가능함
	 * Around Advice의 조인 포인트 매개변수는 ProceedingJoinPoing로 고정
	 * JoinPoint의 하위 인터페이스로 원본 조인 포인트의 진행 시점을 제어할 수 있음
	 * *** 조인 포인트를 진행하는 호출을 잊는 경우가 자주 발생하므로 주의, 
	 * 최소한의 요건을 충족하면서 가장 기능이 약한 어드바이스를 쓰는 것이 바람직 *** 
	 * */
	
	// @Around("execution(* com.kh.chap01_advice.annotation..*(..))")	// pointcut만 넣으면 되므로 따로 속성 명시 안 해도 됨
	@Around("studentAroundPointcut()")	// 하단에 정의한 포인트 컷 사용 (메소드명 기입)
	public Object aroundAttending(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("=================== around attending before ===================");
		System.out.println("오늘도 학원 수업을 열심히 들어야지!! 라는 마음으로 아침 일찍 일어납니다.");
		System.out.println("===============================================================");
		
		/* 메소드 실행 시간을 체크하기 위해 스탑워치 사용 - 스프링에서 제공하는 메소드 */
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		/* ******* 원본 조인 포인트 실행 - study() 메소드 실행 ********* */
		Object result = joinPoint.proceed();
		
		System.out.println("=================== around attending after ===================");
		System.out.println("수업이 끝났으니 퇴실 QR을 찍는다.");
		
		if(joinPoint.getTarget() instanceof BestStudent) {  // instanceof 객체 비교
			System.out.println("수업이 끝나도 공부는 끝나지 않는다. 열심히 복습합니다.");
		}
		
		/* 스탑워치를 종료한다 */
		stopWatch.stop();
		
		System.out.println("총 공부 소요 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)");
		System.out.println("=========================================================");
		
		/* ********** 원본 조인 포인트를 호출한 쪽(현재 Application) 혹은 다른 어드바이스가 다시 실행할 수 있도록 반환 *********** */
		return result;
	}
	
	
	/* @Pointcut을 이용하면 포인트컷만 따로 정의해 여러 어드바이스에서 재사용 가능 
	 * 포인트컷과 애플리케이션 로직이 뒤섞이는 것은 바람직 하지 않으므로 메소드 바디를 비운 포인트컷의 접근 제한자를 통하여 
	 * 포인트 컷 사용 범위를 지정함 */
	
	/* 포인트 컷은 void형 메소드로 작성하고 표현식을 작성한 뒤 메소드명이 포인트 컷의 이름이 됨*/
	@Pointcut("execution(* com.kh.chap01_advice.annotation..*(..))")
	private void studentAroundPointcut() {}
	
}
