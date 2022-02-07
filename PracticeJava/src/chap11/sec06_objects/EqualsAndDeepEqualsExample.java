package chap11.sec06_objects;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));   	// true
		System.out.println(Objects.equals(o1, null));	// false
		System.out.println(Objects.equals(null, o2)); 	// false
		System.out.println(Objects.equals(null, null)); // true
		System.out.println(Objects.deepEquals(o1, o2) + "\n");	
		// true => �迭�� �ƴϱ� ������ Objects.equals(o1, o2)�� ������ ����� ����
		
		System.out.println("-------------------------------------");
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2)); 	// false
		System.out.println(Objects.deepEquals(arr1, arr2)); // true  => �迭�� �ּڰ��� �޶�(���� �ٸ� �迭�̶�) �迭�� �׸��� ������ true ����
		System.out.println(Objects.deepEquals(null, arr2)); // false
		System.out.println(Objects.deepEquals(arr1, null)); // false
		System.out.println(Objects.deepEquals(null, null)); // true
	}

}
