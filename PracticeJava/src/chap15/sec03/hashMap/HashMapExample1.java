package chap15.sec03.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		// 저장된 객체 수
		System.out.println("총 Entry 수 : " + map.size());
		
		// 주어진 키에 해당하는 값을 리턴
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet();	// 전체 키 얻기
		Iterator<String> keyIterator = keySet.iterator();	// 키를 반복해서 얻음
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();	// 하나의 키
			Integer value = map.get(key); 		// 키를 이용해서 값을 얻음
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		// entrySet을 이용하여 전체 객체에서 키와 값 추출
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		
		System.out.println();
		
		// 전체 객체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
