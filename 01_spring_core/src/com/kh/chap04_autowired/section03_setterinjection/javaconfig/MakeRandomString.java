package com.kh.chap04_autowired.section03_setterinjection.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeRandomString {

	private RandomGenerator random;

	public MakeRandomString() {}

	/* setter 주입 */
	@Autowired
	public void setRandom(RandomGenerator random) {
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
