package chap07;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// public void stop() {} final 메소드라 자식객체에서 재정의 불가능
}
