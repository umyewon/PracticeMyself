package chap15.sec03.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String,String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ��� ");
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.println();
			
			// �Է¹��� ���̵�� ��й�ȣ�� 12~15��°�ٿ��� ������ Ű,���� �ش��ϴ��� �˻�
			if(map.containsKey(id)) {
				// �ش� ���̵�� ��й�ȣ�� ���� ����Ǵ��� Ȯ��
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
	}

}
