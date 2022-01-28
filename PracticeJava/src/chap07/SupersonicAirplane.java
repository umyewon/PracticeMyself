package chap07;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
//		super.fly();		// �θ��� fly �޼ҵ� ����
//		System.out.println("������ ���� ���� �����մϴ�.");
//		System.out.println("������ �����մϴ�.");
		
		
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		} else {
			super.fly();
		}
	}
	
}
