package chap07.promotionAccess;

public class ChildExample {

	public static void main(String[] args) {

		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();   // child�� method2�� ȣ�� �� (�������̵� �Ǿ��� ����)
		// parent.method3();
		child.method3();
	
	}

}
