package chap11.sec06_objects.gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);	// ������ ��ü�� �Ǿ���
		emp = null;
		emp = new Employee(2);  // ������ ��ü�� �Ǿ���
		emp = new Employee(3);
			
		System.out.println("emp�� ���������� �����ϴ� ��� ��ȣ :" + emp.eno);
		System.gc();
	}

}
