package method.model;

public class Overloading {

	public void test() {}
	public void test(int a) {}
	public void test(int a, String b) {}
	public void test(String a, int b) {}
	public void test (int a, int b) {}
	// public void test (int c, int d) {}  
	// => ������ ���� : �Ű�������� ����. �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� �������̵� ����
	public void test (int a, int b, String str) {}
	// private void test (int a, int b, String str) {}
	// => ������ ���� : ���������ڿ� ����. ���������ڰ� �޶� �������̵� ������� ����
	/*public int test (int a, int b, String str) {
		return 0;
	}*/
	// => ������ ���� : ��ȯ���� ����. ��ȯ���� �޶� �������̵� ������� ���� 
}
