package chap15.sec02.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");   // 11행과 동일 객체로 판단
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
	
		set.remove("JDBC");
		set.remove("iBatis");
		size = set.size();
		System.out.println("총 객체수 : " + size);
		
		
		for(String element : set ) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("다 지워졌어요");
		} else {
			System.out.println("아직 남아있음");
		}
		
	
	}

}
