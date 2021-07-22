package a_uncheckedException.model;

public class UncheckedException {
	// RuntimeException 
	// : 코드상의 에러는 없지만 프로그램 실행 시 콘솔창에서 에러 발생
	// : 예외처리구문이 필수가 아님 (주로 if문으로 에러 해결)
	
	public void method1() {
		// 1. ArrayIndexOutOfBoundsException
		// : 배열의 index범위를 넘어서 참조하는 경우 
		int[] arr = new int[5];
		
		for(int i = 0; i </*=*/ arr.length; i++) {
			arr[i] = i;
		}
		
		//=> java.lang.ArrayIndexOutOfBoundsException : 5
		//   : arr[5]호출 시 에러 발생 
		//   : 배열의 크기가 5라면 인덱스 범위는 0~4이므로
		//   : for문에서 arr의 범위를 '<='가 아닌 '='로 바꿔야함
		
	}
	
	public void method2() {
		
	}
	

}
