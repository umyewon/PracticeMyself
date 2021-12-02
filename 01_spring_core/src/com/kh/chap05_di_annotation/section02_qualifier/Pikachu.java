package com.kh.chap05_di_annotation.section02_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component	// 이 클래스를 bean 등록
@Primary
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄가 공격합니다. 백만볼트~~~");
	}

}
