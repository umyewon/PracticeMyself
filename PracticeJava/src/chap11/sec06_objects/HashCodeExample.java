package chap11.sec06_objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
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
			// return sno;	=> �л���ȣ�� ���� �̸��� �ٸ� ����� ������ �ؽ��ڵ� ����
			// return name; => �̸��� ���� �й��� �ٸ� ����� ������ �ؽ��ڵ� ����
			
			return Objects.hash(sno, name);	// �й��� �̸��� ������ ����� ������ �ؽ��ڵ� ����
		}
		
		// ��Ȯ�� ����񱳸� ���� �ؽ��ڵ� �Ӹ� �ƴ϶� equals()�� ���ϰ��� ���ϱ� ���� �������̵�
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
