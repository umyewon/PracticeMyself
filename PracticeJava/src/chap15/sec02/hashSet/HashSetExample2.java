package chap15.sec02.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		// new �����ڷ� ���� �ٸ� ��ü������ ���� ������, ���� �ؽ��ڵ�� ���� ��ü��
		
		System.out.println("�� ��ü �� : " + set.size());
		
	}

}
