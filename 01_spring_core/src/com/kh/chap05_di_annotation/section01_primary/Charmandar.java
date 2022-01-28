package com.kh.chap05_di_annotation.section01_primary;

import org.springframework.stereotype.Component;

@Component // 이 클래스를 bean 등록
public class Charmandar implements Pokemon {

	@Override
	public void attack() {
		System.out.println("파이리가 공격합니다! 퐈이아~~~");
	}

}
