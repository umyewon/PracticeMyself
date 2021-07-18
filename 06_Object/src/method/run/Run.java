package method.run;

import java.util.Arrays;

import method.model.Method;

public class Run {

	public static void main(String[] args) {
	
		Method m = new Method();
		
		int num1 = 3;
		int num2 = 5;
		int result = m.method1(num1, num2);
		System.out.println("main num1: " + num1 + ", num2: " + num2 );
		System.out.println("result : " + result);
		
		
		int[] arr = {1,2,3,4,5};
		int[] returnarr = m.method2(arr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("returnarr : " + Arrays.toString(returnarr));
	}

}
