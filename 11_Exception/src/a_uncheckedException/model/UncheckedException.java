package a_uncheckedException.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	// RuntimeException 
	// : 코드상의 에러는 없지만 프로그램 실행 시 콘솔창에서 에러 발생
	// : 예외처리구문이 필수가 아님 (주로 if문으로 에러 해결)
	// : 5개의 후손클래스가 있다.
	
	public void method1() {
		// 1. ArrayIndexOutOfBoundsException
		// : 배열의 index범위를 넘어서 참조하는 경우 
		//  => 배열명.length로 배열의 범위 확인
		int[] arr = new int[5];
		
		for(int i = 0; i </*=*/ arr.length; i++) {
			System.out.print(arr[i] = i);
		}
		
		//=> java.lang.ArrayIndexOutOfBoundsException : 5
		//   : arr[5]호출 시 에러 발생 
		//   : 배열의 크기가 5라면 인덱스 범위는 0~4이므로
		//   : for문에서 arr의 범위를 '<='가 아닌 '='로 바꿔야함
	
		
	}
	

	public void method2() {
		// 2. NullPointerException
		//   : Null인 참조 변수로 객체 멤버 참조 시도 시 발생
		//    => 객체  사용 전 참조 변수가 Null인지 확인
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		System.out.println(arr);  // arr이 참조하는 주소값
		System.out.println(arr[0]); // arr[0]이 참조하는 주소값
		System.out.println(arr[0][0]); // arr[0][0]에 해당하는 값
		// System.out.println(arr[1][0]);
		// => java.lang.NullPointerException 발생
		//    : arr[0]과 다르게 arr[1]은 참조할 객체가 없음
		
	}
	
	public void method3() {
		// 3. ClassCastException
		//  : Cast 연산자 사용 시 타입 오류
		//  => instanceof 연산자로 객체타입 확인 후 cast 연산
		
		String str = "1";
		Object obj = str;
		// Integer integer = (Integer) obj;
		// java.lang.ClassCastException : String은 Integer타입으로 형변환 불가능
		// 현재 obj에 실질적으로 담겨있는 값은 str(String)
		
		Integer integer = null;
		if(obj instanceof Integer) {
			integer = (Integer)obj;
		}else if(obj instanceof String) {
			integer = Integer.parseInt((String)obj);
		}
		System.out.println(integer);
	}
		
	
	public void method4() {
		// 4. ArithmeticException 
		//   : 0으로 나누는 경우 발생
		//   => if문으로 나누는 수가 0인지 검사
		
		int ran = 0;
		double result = 0.0;
		
		/*for(int i = 0; i < 10; i++) {
			ran = (int) (Math.random()*10);   // 0~9까지의 난수(랜덤 숫자)발생
			result = 10 / ran;
			if(ran == 0) {
				System.out.println("ran : 10 / 0은 불가능합니다.");
				break;
			} else {
				System.out.println(result);
			}
		}*/
		
		// if문 말고 예외처리문 (try~catch)로 해결한다면?
		// try{} : 예외가 발생되는 구문 작성
		// catch(예외클래스 매개변수){} : 예외가 발생되는 경우 처리해야되는 구문 작성
		for(int i = 0; i < 10; i++) {
			ran = (int)(Math.random()*10);
			try {
				result = 10/ ran;
				System.out.println("10/"+ ran +"="+ result);
				}catch(ArithmeticException e) {
					// e.printStackTrace();
					// System.out.println(e.getMessage());  => 에러메세지 불러오
					System.out.println("10/" + ran +"은 불가능합니다.");
				}
			
		}
	}
	
	public void method5() {
		// 5. NegativeArraySizeException
		//   : 배열 크기를 음수로 지정한 경우 발생
		//   => 배열 크기를 0보다 크게 지정해야 함
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		if(num > 0) {
			int[] arr = new int [num];
		}else {
			System.out.println("양수를 입력하세요.");
		}
	}
		
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력 : " );
		int num = sc.nextInt();
		try {
			int result = 10/ num;
			System.out.println(result);			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException : 0으로 나눌 수 없습니다");
		}catch(InputMismatchException e){
			System.out.println("InputMismatchException : 숫자만 입력 가능합니다.");
		}catch(RuntimeException e) {
			System.out.println("모든 RuntimeException 받아주기 ");
			// RuntimeException이 위의 클래스들의 부모클래스
		}catch(Exception e) {
			System.out.println("모든 Exception 받아주기");
			// Exception이 모든 예외들의 부모클래스
			// 부모 클래스의 catch구문이 가장 아래로 가게 작성
			// 만약 부모 클래스가 가장 위로 간다면? 그 아래의 자식 코드는 실행되지 않는다 !
		}
		

	}
	

}
