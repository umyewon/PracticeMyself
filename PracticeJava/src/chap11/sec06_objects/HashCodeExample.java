package chap11.sec06_objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		
		
	}
	
	
	static class Student{
		int sno;
		String name;
		
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			// return sno;	=> 학생번호가 같고 이름이 다른 사람도 동등한 해시코드 리턴
			// return name; => 이름이 같고 학번이 다른 사람도 동등한 해시코드 리턴
			
			return Objects.hash(sno, name);	// 학번과 이름이 동일한 사람은 동등한 해시코드 리턴
		}
		
		// 정확한 동등비교를 위해 해시코드 뿐만 아니라 equals()의 리턴값도 비교하기 위해 오버라이딩
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student)obj;
				if(s.sno == this.sno) {
					if(s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}
	
}
