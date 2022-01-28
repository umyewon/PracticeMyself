package com.kh.chap00_coupling;

public class ClassB {

	/* ClassA => ClassAA
	 * 클래스명을 변경하면 타입 선언,생성자에 컴파일 에러 발생
	 * -> 서로 연관/결합되어 있으므로 결합도를 느슨하게 만들어서 에러 발생을 막자!
	 */
	// private ClassA classA = new ClassA();  => ClassA로 선언하면 클래스가 변경될 때마다 에러가 발생
	
	
	
	/* 필드 선언 
	 * 다형성을 적용하여 클래스가 아닌 상위 타입의 인터페이스 타입으로 작성 -> 타입 은닉 
	 * (생성자는 명시하면 안되므로 제거) */
	private InterA classA;
	
	/* 기본 생성자 + setter */
	public ClassB() {}
	
	/* 매개변수 생성자에서 필드값 초기화를 강제함 : 클래스가 아닌 상위 타입의 인터페이스로 선언
	 * => 클래스가 수정되어도 결합도가 느슨해서 에러가 발생하지 않음*/
	public ClassB(InterA classA) {
		this.classA = classA;
	}
	
	/* 기본 생성자 초기화 시 사용할 setter */
	public void setClassA(InterA classA) {
		this.classA = classA;
	}

	public void methodB() {
		/* 필드에 선언되어 컴파일 에러는 없지만
		 * 객체가 담기지 않아 NullPointerException 발생*/
		classA.methodA();
	}
}
