package chap15.sec01.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();	// �ʱ� ����뷮 10
		
		list.add("Java");
		list.add("Jdbc");
		list.add("Servlet/JSP");  // 2���� �ƴ� 3���� �����
		list.add(2, "Database");
		list.add("iBatis");   // 4�� �ε����� �����
		
		int size = list.size();
		System.out.println("�� ��ü �� : " + size);
		System.out.println();
		
		
		String skill = list.get(2);
		System.out.println("2�ε��� : " + skill);
		
		// �ݺ���
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +" �ε����� ��ü : " + str);
		}
		
		System.out.println();
		
		// ����
		list.remove(2);
		list.remove(2); 
		list.remove("iBatis");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +" �ε����� ��ü : " + str);
		}
		
		System.out.println();
		
		
		
	}

}
