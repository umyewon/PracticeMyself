package chap15.sec02.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		// new 생성자로 서로 다른 객체이지만 동일 데이터, 동일 해시코드로 동등 객체임
		
		System.out.println("총 객체 수 : " + set.size());
		
	}

}
