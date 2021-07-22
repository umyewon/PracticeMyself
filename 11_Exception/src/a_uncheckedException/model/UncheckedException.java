package a_uncheckedException.model;

public class UncheckedException {
	// RuntimeException 
	// : �ڵ���� ������ ������ ���α׷� ���� �� �ܼ�â���� ���� �߻�
	// : ����ó�������� �ʼ��� �ƴ� (�ַ� if������ ���� �ذ�)
	
	public void method1() {
		// 1. ArrayIndexOutOfBoundsException
		// : �迭�� index������ �Ѿ �����ϴ� ��� 
		//  => �迭��.length�� �迭�� ���� Ȯ��
		int[] arr = new int[5];
		
		for(int i = 0; i </*=*/ arr.length; i++) {
			System.out.print(arr[i] = i);
		}
		
		//=> java.lang.ArrayIndexOutOfBoundsException : 5
		//   : arr[5]ȣ�� �� ���� �߻� 
		//   : �迭�� ũ�Ⱑ 5��� �ε��� ������ 0~4�̹Ƿ�
		//   : for������ arr�� ������ '<='�� �ƴ� '='�� �ٲ����
	
		
	}
	

	public void method2() {
		// 2. NullPointerException
		//   : Null�� ���� ������ ��ü ��� ���� �õ� �� �߻�
		//    => ��ü  ��� �� ���� ������ Null���� Ȯ��
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		System.out.println(arr);  // arr�� �����ϴ� �ּҰ�
		System.out.println(arr[0]); // arr[0]�� �����ϴ� �ּҰ�
		System.out.println(arr[0][0]); // arr[0][0]�� �ش��ϴ� ��
		// System.out.println(arr[1][0]);
		// => java.lang.NullPointerException �߻�
		//    : arr[0]�� �ٸ��� arr[1]�� ������ ��ü�� ����
		
	}
	
	public void method3() {
		// 3. ClassCastException
		//  : Cast ������ ��� �� Ÿ�� ����
		//  => instanceof �����ڷ� ��üŸ�� Ȯ�� �� cast ����
		
		String str = "1";
		Object obj = str;
		// Integer integer = (Integer) obj;
		// java.lang.ClassCastException : String�� IntegerŸ������ ����ȯ �Ұ���
		// ���� obj�� ���������� ����ִ� ���� str(String)
		
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
		//   : 0���� ������ ��� �߻�
		//   => if������ ������ ���� 0���� �˻�
		
		int ran = 0;
		double result = 0.0;
		
		/*for(int i = 0; i < 10; i++) {
			ran = (int) (Math.random()*10);   // 0~9������ ����(���� ����)�߻�
			result = 10 / ran;
			if(ran == 0) {
				System.out.println("ran : 10 / 0�� �Ұ����մϴ�.");
				break;
			} else {
				System.out.println(result);
			}
		}*/
		
		// if�� ���� ����ó���� (try~catch)�� �ذ��Ѵٸ�?
		// try{} : ���ܰ� �߻��Ǵ� ���� �ۼ�
		// catch(����Ŭ���� �Ű�����){} : ���ܰ� �߻��Ǵ� ��� ó���ؾߵǴ� ���� �ۼ�
		for(int i = 0; i < 10; i++) {
			ran = (int)(Math.random()*10);
			try {
				result = 10/ ran;
				System.out.println("10/"+ ran +"="+ result);
				}catch(ArithmeticException e) {
					// e.printStackTrace();
					// System.out.println(e.getMessage());  => ���� �� �߻��ϴ� ���� ���
					System.out.println("10/" + ran +"�� �Ұ����մϴ�.");
				}
			
		}
	}
		
	
	

}
