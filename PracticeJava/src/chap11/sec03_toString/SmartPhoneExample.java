package chap11.sec03_toString;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
		System.out.println(myPhone);
		// 결과 동일
	}

}
