package com.kh.chap00_coupling;

/* 해당 클래스를 사용하는 클래스들과의 결합도를 낮추기 위해 
 * Interface를 생성하고 implements 함 
 * => 클래스가 변경되어도 문제 없음 */

public class ClassAAA implements InterA {	// 인터페이스의 구현체

	public void methodA() {}
	
}
