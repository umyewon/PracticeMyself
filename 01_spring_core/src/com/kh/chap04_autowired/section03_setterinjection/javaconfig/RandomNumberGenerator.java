package com.kh.chap04_autowired.section03_setterinjection.javaconfig;

/* 인스턴스 생성 시 범위 값을 입력 받아 랜덤한 수를 리턴하는 용도의 클래스 */
public class RandomNumberGenerator implements RandomGenerator{

	private int startNum;
	private int endNum;
	
	public RandomNumberGenerator(int startNum, int endNum) throws Exception {
		// 예외 발생 시키기
		if(startNum >= endNum) {
			throw new Exception("시작 값이 종료 값보다 클 수 없습니다.");		
		} else if (startNum <= 0 || endNum <= 0){
			throw new Exception("양의 정수만 입력해주세요.");
		}
		
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	/* 난수 발생시키는 메소드 */
	@Override
	public int getRandomNumber() {
		return (int)(Math.random() * (endNum - startNum + 1)) + startNum;		// 곱하기는 범위값 더하기는 시작값
	}

	/* 난수 시작 값 가져오는 메소드 */
	@Override
	public int getStartNum() {
		return startNum;
	}

	/* 난수 범위 종료 값 가져오는 메소드 */
	@Override
	public int getEndNum() {
		return endNum;
	}

}
