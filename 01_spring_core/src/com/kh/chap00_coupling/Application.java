package com.kh.chap00_coupling;

public class Application {

	public static void main(String[] args) {
		// new ClassB(new ClassAA()).methodB();
		
		/* setter를 사용 */
		ClassB classB = new ClassB();
		classB.setClassA(new ClassAAA());
		classB.methodB();
	}

}
