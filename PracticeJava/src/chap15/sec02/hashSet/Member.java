package chap15.sec02.hashSet;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && member.age == age;
		} else {
			return false;
		}
	}
	
	// 나이와 이름이 동일할 때 hashcode도 동일
	@Override
	public int hashCode() {
		return Objects.hash(name.hashCode() + age);
	}
	
}
