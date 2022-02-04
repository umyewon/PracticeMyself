package chap11.sec02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "È«±æµ¿");
		 
		String value = hashMap.get(new Key(1));    // À§ÀÇ new Key(1)¿Í ´Ù¸¥ °´Ã¼°¡ ¶Ç »ý¼ºµÊ
		System.out.println(value);
	}

}
