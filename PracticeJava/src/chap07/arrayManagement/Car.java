package chap07.arrayManagement;

public class Car { // 하나의 배열로 객체 관리
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	int run() { // 0은 모든 타이어가 정상 작동 그 외의 숫자는 해당 타이어의 펑크
		System.out.println("[자동차가 달립니다.]");
		
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i + 1);  // i는 0부터 시작이니까 + 1 해줌
				
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
	
	
}
