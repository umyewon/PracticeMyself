package com.kh.chap04_autowired.section02_constinjection.xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeRandomString {

	private RandomGenerator random;

	/* 기본 생성자를 만들어보면 @Autowired 어노테이션을 생략했을 시 에러발생
	 * 생성자를 통해 필드에 객체가 주입되지 않았기 때문에 NullPointException 발생
	 * 이 때는 @Autowired를 명시적으로 적어야함*/
	//public MakeRandomString() {}
	

	/* 생성자 주입 */
	@Autowired
	public MakeRandomString(RandomGenerator random) {
		/* 스프링 4.3 이후부터 생성자에 주입할 시 생성자가 한개 뿐이라면
		 * 해당 생성자에 @Autowired 어노테이션을 생략해도 자동으로 주입해줌*/
		this.random = random;
	}
	
	public String getRandomLengthString() {
		StringBuilder sb = new StringBuilder();		// StringBuilder : 계속해서 변화하는 String 값을 효율적이게 저장하는 객체
		
		int randomNumber = random.getRandomNumber();
		for(int i = random.getStartNum(); i <= randomNumber; i++) {
			sb.append("*");
		}
		
		return sb.toString();
	}
}
