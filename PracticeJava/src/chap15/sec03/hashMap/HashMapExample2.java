package chap15.sec03.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "È«±æµ¿"), 95);
		map.put(new Student(1, "È«±æµ¿"), 90);
		
		System.out.println("ÃÑ ¿£Æ®¸® ¼ö : " + map.size());
		System.out.println("ÀúÀå °´Ã¼ Á¤º¸ : " + map.get(new Student(1, "È«±æµ¿")));
	}

}
