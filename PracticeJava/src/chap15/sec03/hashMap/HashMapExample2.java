package chap15.sec03.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 90);
		
		System.out.println("�� ��Ʈ�� �� : " + map.size());
		System.out.println("���� ��ü ���� : " + map.get(new Student(1, "ȫ�浿")));
	}

}
