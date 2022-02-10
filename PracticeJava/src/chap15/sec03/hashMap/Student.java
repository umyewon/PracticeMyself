package chap15.sec03.hashMap;

import java.util.Objects;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return sno == student.sno && name.equals(student.name);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// return Objects.hash(sno, name);  
		return sno + name.hashCode();  // 하위 호환성을 위해 해당 코드 사용
	
	}
	
}
