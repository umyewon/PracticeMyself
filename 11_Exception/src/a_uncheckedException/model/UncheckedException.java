package a_uncheckedException.model;

public class UncheckedException {
	// RuntimeException 
	// : �ڵ���� ������ ������ ���α׷� ���� �� �ܼ�â���� ���� �߻�
	// : ����ó�������� �ʼ��� �ƴ� (�ַ� if������ ���� �ذ�)
	
	public void method1() {
		// 1. ArrayIndexOutOfBoundsException
		// : �迭�� index������ �Ѿ �����ϴ� ��� 
		int[] arr = new int[5];
		
		for(int i = 0; i </*=*/ arr.length; i++) {
			arr[i] = i;
		}
		
		//=> java.lang.ArrayIndexOutOfBoundsException : 5
		//   : arr[5]ȣ�� �� ���� �߻� 
		//   : �迭�� ũ�Ⱑ 5��� �ε��� ������ 0~4�̹Ƿ�
		//   : for������ arr�� ������ '<='�� �ƴ� '='�� �ٲ����
		
	}
	
	public void method2() {
		
	}
	

}
