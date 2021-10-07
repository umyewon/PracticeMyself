package method.model;

public class Overloading {

	public void test() {}
	public void test(int a) {}
	public void test(int a, String b) {}
	public void test(String a, int b) {}
	public void test (int a, int b) {}
	// public void test (int c, int d) {}  
	// => 컴파일 에러 : 매개변수명과 무관. 자료형의 개수와 순서가 다르게 작성되어야 오버라이딩 적용
	public void test (int a, int b, String str) {}
	// private void test (int a, int b, String str) {}
	// => 컴파일 에러 : 접근제어자와 무관. 접근제어자가 달라도 오버라이딩 적용되지 않음
	/*public int test (int a, int b, String str) {
		return 0;
	}*/
	// => 컴파일 에러 : 반환형과 무관. 반환형이 달라도 오버라이딩 적용되지 않음 
}
