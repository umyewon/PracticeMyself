package chap11.sec06_objects.gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno +")이 메모리에 생성됨");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + eno +")이 메모리에서 제거됨");
		
	}
}
