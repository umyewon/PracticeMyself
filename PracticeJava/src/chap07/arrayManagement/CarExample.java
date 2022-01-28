package chap07.arrayManagement;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <= 5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {  // 타이어가 펑크났을 때
				System.out.println(car.tires[problemLocation - 1]/* 인덱스 번호 */.location + "HankookTire로 교체"); 
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15); // 펑크난 타이어를 한국 타이어로 교체
			}
			System.out.println("-------------------------------------------");
		}
	
	}

}
