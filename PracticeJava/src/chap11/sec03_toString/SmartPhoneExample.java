package chap11.sec03_toString;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
		System.out.println(myPhone);
		// ��� ����
	}

}
