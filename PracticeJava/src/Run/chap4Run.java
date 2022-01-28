package Run;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class chap4Run {
	
	// 무한루프 속도 비교를 위한 데이터
	//public static ArrayList<Integer> testData = InputTestData();
 
	public static void main(String[] args) {

		int random = (int) (Math.random()*10) + 1; // +1이 없다면 0~9까지의 정수
		System.out.println("1~10 사이의 난수 : " + random);
		
		random = (int)(Math.random()*100)+ 1;
		System.out.println("1~100 사이의 난수 : " + random);
		
		
		/* 구구단 만들기 */
		for(int i = 2; i <= 9; i++ ) {
			System.out.println("======구구단 " + i + "단=======");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "="  + i*j);
			}
		}
		
		/* 1~100까지의 정수 중 3의 배수의 총 합 구하기 */
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			} else {
				continue;
			}
		}
		System.out.println("3의 배수 총 합 =" + sum);
		
		/* 2개의 주사위를 던졌을 때 두 눈의 합이 5인 경우 실행을 멈추기  */
		
		while(true) {
			int i = (int)(Math.random() * 6) + 1;
			int j = (int)(Math.random() * 6) + 1;

			System.out.println("(" + i + "," + j + ")");
			if(i + j == 5) {
				break;
			}
		}
		
		/* 별찍기 */
		
		for(int i =1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println();
				}
			}
		}
		
		/* 무한루프 속도 비교 */
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
		System.out.println("for 걸린 시간은 " + sumTime + "밀리초 입니다.");
		
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
		System.out.println("While 걸린 시간은 " + sumTime + "밀리초 입니다.");
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
		System.out.println("Iterator 걸린 시간은 " + sumTime + "밀리초 입니다.");
	}
 	
	private static ArrayList<Integer> InputTestData() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < 15000000; i++) {
			arr.add(i);
		}
		
		return arr;
	}*/

	

}
