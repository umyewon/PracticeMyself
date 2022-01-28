package com.kh.chap05_di_annotation.section01_primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component	// 이 클래스를 bean 등록
@Primary	
/*@Primary어노테이션 : @Autowired로 동일한 타입의 여러 bean을 찾게 되는 경우 자동 연결을 우선시 할 타입으로 설정
 * 동일한 타입(Pokemon) 클래스 중 한개만 @Primary 어노테이션 사용 가능*/
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄가 공격합니다. 백만볼트~~~");
	}

}
