package chap15.sec01.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();	// 초기 저장용량 10
		
		list.add("Java");
		list.add("Jdbc");
		list.add("Servlet/JSP");  // 2번이 아닌 3번에 저장됨
		list.add(2, "Database");
		list.add("iBatis");   // 4번 인덱스에 저장됨
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		
		String skill = list.get(2);
		System.out.println("2인덱스 : " + skill);
		
		// 반복문
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +" 인덱스의 객체 : " + str);
		}
		
		System.out.println();
		
		// 삭제
		list.remove(2);
		list.remove(2); 
		list.remove("iBatis");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +" 인덱스의 객체 : " + str);
		}
		
		System.out.println();
		
		
		
	}

}
