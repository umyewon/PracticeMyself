package chap07.promotion;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// B b2 = e; e는 B 객체와는 상속관계가 아니기 때문에 자동 타입 변환 불가능
		// C c2 = d; d는 c 객체와는 상속관계가 아니기 때문에 자동 타입 변환 불가능
		
		
		
	}

}
