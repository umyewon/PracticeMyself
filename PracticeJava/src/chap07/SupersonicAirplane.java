package chap07;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
//		super.fly();		// 부모의 fly 메소드 실행
//		System.out.println("초음속 비행 모드로 변경합니다.");
//		System.out.println("초음속 비행합니다.");
		
		
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
	}
	
}
