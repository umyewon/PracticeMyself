package chap11.sec07_String;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception{
		byte[] bytes = new byte[100];
		
		System.out.print("ют╥б :" );
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
		
	}

}
