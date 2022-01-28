package Run;

public class variableRun {

	public static void main(String[] args) {
		
		byte byteType = 10;
		int intType = byteType;
		System.out.println(intType);

		char charType = '가';
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
		// float num3일 때 결과 = -4 (0이 나와야 정상인데 0이 아님 정밀도 손실 발생)
		// double num3일 때 결과 = 0
		
	}

}
