package chap07;

public class Student extends People{
	public int studentNo;
	
	public Student() {
		// super();		// People는 기본 생성자가 없기 때문에 컴파일 오류 발생하는 것
		
		super("홍길동", "970816-123456");
	}
}
