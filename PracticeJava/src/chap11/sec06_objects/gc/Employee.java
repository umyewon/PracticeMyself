package chap11.sec06_objects.gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno +")�� �޸𸮿� ������");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + eno +")�� �޸𸮿��� ���ŵ�");
		
	}
}
