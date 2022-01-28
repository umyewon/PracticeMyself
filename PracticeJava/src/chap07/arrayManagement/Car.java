package chap07.arrayManagement;

public class Car { // �ϳ��� �迭�� ��ü ����
	Tire[] tires = {
			new Tire("�տ���", 6),
			new Tire("�տ�����", 2),
			new Tire("�ڿ���", 3),
			new Tire("�ڿ�����", 4)
	};
	
	int run() { // 0�� ��� Ÿ�̾ ���� �۵� �� ���� ���ڴ� �ش� Ÿ�̾��� ��ũ
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i + 1);  // i�� 0���� �����̴ϱ� + 1 ����
				
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
	}
	
	
}
