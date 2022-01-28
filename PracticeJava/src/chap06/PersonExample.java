package chap06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person ps = new Person("1234567-891234", "예원");
		
		System.out.println(ps.nation);
		System.out.println(ps.ssn);
		System.out.println(ps.name);
		
		ps.name = "길동";
		// ps.nation = "USA";		  다시 초기화 불가능
		// ps.ssn = "1234213-12334";  다시 초기화 불가능
		System.out.println(ps.nation);
		System.out.println(ps.ssn);
		System.out.println(ps.name);
		
	}

}
