package com.kh.chap05_di_annotation.section01_primary;

import org.springframework.stereotype.Component;

@Component // 이 클래스를 bean 등록
public class Squirtle implements Pokemon{

	@Override
	public void attack() {
		System.out.println("꼬부기가 공격합니다! 받아라 물대포~~~");
	}

}
