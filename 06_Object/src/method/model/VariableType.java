package method.model;

public class VariableType {
	
	// �⺻�� �Ű������� ������ �Ű����� �����ϱ�
	

	public int method1(int num1, int num2) {  // �⺻�ڷ��� (������ ���� �����ϱ� ������ �� �б⸸ ����)
		num1++;
		num2++;
		System.out.println("�޼ҵ� num1: " + num1 + ", num2: " + num2);
		return num1+num2;
	}
	
	public int[] method2(int[]arr) {	// �����ڷ��� (�ּҰ��� �����ϱ� ������ �� �б�, ���� ����)
		arr[2] = 99;
		return arr;
	}
	
	
}
