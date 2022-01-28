package com.kh.chap05_di_annotation.section05_inject;

import org.springframework.stereotype.Component;

@Component	// 이 클래스를 bean 등록
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄가 공격합니다. 백만볼트~~~");
	}

}
