package Run;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class chap4Run {
	
	// ���ѷ��� �ӵ� �񱳸� ���� ������
	//public static ArrayList<Integer> testData = InputTestData();
 
	public static void main(String[] args) {

		int random = (int) (Math.random()*10) + 1; // +1�� ���ٸ� 0~9������ ����
		System.out.println("1~10 ������ ���� : " + random);
		
		random = (int)(Math.random()*100)+ 1;
		System.out.println("1~100 ������ ���� : " + random);
		
		
		/* ������ ����� */
		for(int i = 2; i <= 9; i++ ) {
			System.out.println("======������ " + i + "��=======");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "="  + i*j);
			}
		}
		
		/* 1~100������ ���� �� 3�� ����� �� �� ���ϱ� */
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			} else {
				continue;
			}
		}
		System.out.println("3�� ��� �� �� =" + sum);
		
		/* 2���� �ֻ����� ������ �� �� ���� ���� 5�� ��� ������ ���߱�  */
		
		while(true) {
			int i = (int)(Math.random() * 6) + 1;
			int j = (int)(Math.random() * 6) + 1;

			System.out.println("(" + i + "," + j + ")");
			if(i + j == 5) {
				break;
			}
		}
		
		/* ����� */
		
		for(int i =1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println();
				}
			}
		}
		
		/* ���ѷ��� �ӵ� �� */
		//chap4Run.For();
		//chap4Run.While();
		//chap4Run.Iterator();
		
	}
	
	/*public static void For() {
		
		System.out.println("======For======");
		long startTime = new Date().getTime();
		int i;
		for(i = 0; i < testData.size(); i++) {
			int v = testData.get(i);
		}
		
		long endTime = new Date().getTime();
		long sumTime = endTime - startTime;
		System.out.println("for �ɸ� �ð��� " + sumTime + "�и��� �Դϴ�.");
		
	}
	
	public static void While() {
		
		System.out.println("========while========");
		long startTime = new Date().getTime();
		int i = 0;
		while(i < testData.size()) {
			int v = testData.get(i);
			i++;
		}
		
		long endTime = new Date().getTime();
		long sumTime = endTime - startTime;
		System.out.println("While �ɸ� �ð��� " + sumTime + "�и��� �Դϴ�.");
	}
	
	public static void Iterator() {
		
		System.out.println("========Iterator========");
		long startTime = new Date().getTime();
		
		
		Iterator<Integer> itr;
		
		for(itr = testData.iterator(); itr.hasNext();) {
			testData.get(itr.next());
		}
		
		long endTime = new Date().getTime();
		long sumTime = endTime - startTime;
		System.out.println("Iterator �ɸ� �ð��� " + sumTime + "�и��� �Դϴ�.");
	}
 	
	private static ArrayList<Integer> InputTestData() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < 15000000; i++) {
			arr.add(i);
		}
		
		return arr;
	}*/

	

}
