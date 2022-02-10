package chap15.sec01.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		/* ArrayList�� LinkedList ��ü ���� �� �ӵ� �� */
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			// i�� ���ڿ��� ����� ����
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð� : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			// i�� ���ڿ��� ����� ����
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð� : " + (endTime - startTime) + "ns");
		
	}

}
