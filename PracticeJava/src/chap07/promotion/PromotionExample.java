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
		
		// B b2 = e; e�� B ��ü�ʹ� ��Ӱ��谡 �ƴϱ� ������ �ڵ� Ÿ�� ��ȯ �Ұ���
		// C c2 = d; d�� c ��ü�ʹ� ��Ӱ��谡 �ƴϱ� ������ �ڵ� Ÿ�� ��ȯ �Ұ���
		
		
		
	}

}
