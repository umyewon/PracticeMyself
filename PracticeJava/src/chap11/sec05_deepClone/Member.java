package chap11.sec05_deepClone;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// 깊은 복제 - 참조타입들은 직접 넣어줘야됨
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();  // super를 붙이지 않으면 아래의 clone이 실행되어 stackoverflow 발생함 super를 붙여 Object 클래스의 clone을 실행시켜야됨
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);	 // => 배열을 볶사하는 copyOf 메소드
		cloned.car = new Car(this.car.model);	// 현재 Member객체의 Car 클래스와 동일한 데이터를(this.car.model) 새로운 Car 객체에 넣어줌
	
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();   // 위에서 재정의한 clone()메소드 실행되어 깊은 복제가 발생
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
	 
		return cloned;
	}
	
}
