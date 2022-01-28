package chap07.fieldPolymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <= 5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1 : System.out.println("�տ��� Hankook Ÿ�̾�� ��ü");
						car.frontLeftTire = new HankookTire("�տ���", 15);
						break;
				case 2 : System.out.println("�տ����� Hankook Ÿ�̾�� ��ü");
						car.frontLeftTire = new KumhoTire("�տ�����", 13);
						break;
				case 3 : System.out.println("�ڿ��� Hankook Ÿ�̾�� ��ü");
						car.frontLeftTire = new HankookTire("�ڿ���", 14);
						break;
				case 4 : System.out.println("�ڿ����� Hankook Ÿ�̾�� ��ü");
						car.frontLeftTire = new KumhoTire("�ڿ�����", 17);
						break;
			}
			
			System.out.println("-------------------------------------------");
		}
	
	}

}
