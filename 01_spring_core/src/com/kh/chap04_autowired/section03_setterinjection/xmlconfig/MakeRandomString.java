package com.kh.chap04_autowired.section03_setterinjection.xmlconfig;

public class MakeRandomString {

	private RandomGenerator random;

	/* setter를 이용한 주입 */
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
