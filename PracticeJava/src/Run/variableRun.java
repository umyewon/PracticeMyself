package Run;

public class variableRun {

	public static void main(String[] args) {
		
		byte byteType = 10;
		int intType = byteType;
		System.out.println(intType);

		char charType = '��';
		intType = charType;
		System.out.println(intType);
		
		intType = 500;
		long longType = intType;
		System.out.println(longType);
		
		intType = 200;
		double doubleType = intType;
		System.out.println(doubleType);
		
		longType = 10000000L;
		
		int intValue = 100000;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		byteValue = Byte.MAX_VALUE;
		System.out.println(byteValue);
		
		byteValue = Byte.MIN_VALUE;
		System.out.println(byteValue);
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		// float num3 = num2;
		double num3 = num2;
		System.out.println("num3:" + num3);
		
		num2 = (int)num3;
		System.out.println("num2 : " + num2);
		
		int result = num1 - num2;
		System.out.println(result);
		// float num3�� �� ��� = -4 (0�� ���;� �����ε� 0�� �ƴ� ���е� �ս� �߻�)
		// double num3�� �� ��� = 0
		
	}

}
