package chap11.sec02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "ȫ�浿");
		 
		String value = hashMap.get(new Key(1));    // ���� new Key(1)�� �ٸ� ��ü�� �� ������
		System.out.println(value);
	}

}
