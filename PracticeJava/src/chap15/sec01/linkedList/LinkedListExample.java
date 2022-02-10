package chap15.sec01.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		/* ArrayList와 LinkedList 객체 삽입 시 속도 비교 */
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			// i를 문자열로 만들어 저장
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			// i를 문자열로 만들어 저장
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");
		
	}

}
