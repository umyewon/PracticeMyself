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
		
		// ���� ���� �� ã��
		score = scores.first();
		System.out.println("���� ���� ���� : " + score);
		
		// ���� ���� �� ã��
		score = scores.last();
		System.out.println("���� ���� ���� : " + score + "\n");
		
		// ������ �ִ� �� ã��
		score = scores.lower(95);
		System.out.println("95�� �Ʒ� ���� : " + score + "\n");
		
		score = scores.higher(95);
		System.out.println("95�� ���� ���� : " + score + "\n");
		
		score = scores.floor(95);  // lower���� ���̴� �Ű����� ����
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : " + score + "\n");
		
		score = scores.ceiling(85);
		System.out.println("95���̰ų� �ٷ� ���� ���� : " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(���� ��ü �� : " + scores.size() + ")");
		}
		
	}
}
