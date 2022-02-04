package chap11.sec04_clone;

public class MemberExample {

	public static void main(String[] args) {

		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";	// 원본 객체의 password 값은 변경되지 않고 복제 객체만 변경됨 -> 데이터 보존
		
		System.out.println("원본 객체의 필드값");
		System.out.println("id : " + original.id );
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password );
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);
		
		
		System.out.println("----------------------------");
		System.out.println("복제 객체의 필드값");
		System.out.println("id : " + cloned.id );
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password );
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		
	}

	
}
