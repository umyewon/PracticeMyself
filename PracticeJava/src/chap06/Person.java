package chap06;

public class Person {

	final String nation = "Korea";	// 필드 선언 시 초기화
	final String ssn;				// 주민번호 (태어남과 동시에 생기는 것이기 때문에 생성자 영역에서 초기화)
	String name;					// 이름 (이름은 변경 가능하기 때문에 final로 선언하지 않음(
	
	public Person(String ssn, String name) {
		this.ssn = ssn;		// 생성자 초기화
		this.name = name;
		// nation = "America";  => 필드 선언 시 초기화 해줬기 때문에 생성자에서 초기화 불가능
	}
}
