package chap15.sec03.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		
		// ����� ��ü ��
		System.out.println("�� Entry �� : " + map.size());
		
		// �־��� Ű�� �ش��ϴ� ���� ����
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		Set<String> keySet = map.keySet();	// ��ü Ű ���
		Iterator<String> keyIterator = keySet.iterator();	// Ű�� �ݺ��ؼ� ����
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();	// �ϳ��� Ű
			Integer value = map.get(key); 		// Ű�� �̿��ؼ� ���� ����
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());
		
		// entrySet�� �̿��Ͽ� ��ü ��ü���� Ű�� �� ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());
	}

}
