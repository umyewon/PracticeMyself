package chap11.sec07_String;

public class ByteToStringExample {

	public static void main(String[] args) throws Exception {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		// byte 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		

	}

}
