package chap07.arrayManagement;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <= 5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {  // Ÿ�̾ ��ũ���� ��
				System.out.println(car.tires[problemLocation - 1]/* �ε��� ��ȣ */.location + "HankookTire�� ��ü"); 
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15); // ��ũ�� Ÿ�̾ �ѱ� Ÿ�̾�� ��ü
			}
			System.out.println("-------------------------------------------");
		}
	
	}

}
