package chap07.promotionAccess;

public class ChildExample {

	public static void main(String[] args) {

		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();   // child의 method2가 호출 됨 (오버라이딩 되었기 때문)
		// parent.method3();
		child.method3();
	
	}

}
