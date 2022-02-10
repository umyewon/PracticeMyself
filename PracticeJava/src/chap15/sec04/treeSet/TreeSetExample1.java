package chap15.sec04.treeSet;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		// 가장 작은 수 찾기
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		// 가장 높은 수 찾기
		score = scores.last();
		System.out.println("가장 낮은 점수 : " + score + "\n");
		
		// 인접해 있는 수 찾기
		score = scores.lower(95);
		System.out.println("95점 아래 점수 : " + score + "\n");
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수 : " + score + "\n");
		
		score = scores.floor(95);  // lower와의 차이는 매개값도 포함
		System.out.println("95점이거나 바로 아래 점수 : " + score + "\n");
		
		score = scores.ceiling(85);
		System.out.println("95점이거나 바로 위의 점수 : " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
		}
		
	}
}
