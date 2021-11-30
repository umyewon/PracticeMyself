package method.model;

public class VariableType {
	
	// 기본형 매개변수와 참조형 매개변수 구분하기
	

	public int method1(int num1, int num2) {  // 기본자료형 (데이터 값을 복사하기 때문에 값 읽기만 가능)
		num1++;
		num2++;
		System.out.println("메소드 num1: " + num1 + ", num2: " + num2);
		return num1+num2;
	}
	
	public int[] method2(int[]arr) {	// 참조자료형 (주소값을 복사하기 때문에 값 읽기, 변경 가능)
		arr[2] = 99;
		return arr;
	}
	
	
}
