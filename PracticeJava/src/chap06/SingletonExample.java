package chap06;

public class SingletonExample {

	public static void main(String[] args) {

		// Singleton obj1 = new Singleton();
		// Singleton obj2 = new Singleton();
		/* Singleton Ŭ������ �����ڴ� private ���� �����ڷ� �ܺο��� ������ �� ���� 
		 * ���Ƶױ� ������ ��� �Ұ� */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� singleton ��ü�Դϴ�.");
		}
	}

}
