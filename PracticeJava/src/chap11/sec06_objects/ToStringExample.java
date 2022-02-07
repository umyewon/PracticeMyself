package chap11.sec06_objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		
		System.out.println(Objects.toString(str1, "이름 있음"));
		System.out.println(Objects.toString(str2, "이름 없음"));
		
	}

}
