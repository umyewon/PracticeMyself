package chap11.sec06_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			System.out.println(Objects.requireNonNull(str2, ()->"이름이 없습니다."));    // ()-> : 람다식
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
	
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
	}

}
