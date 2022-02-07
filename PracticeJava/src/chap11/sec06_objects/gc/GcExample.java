package chap11.sec06_objects.gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);	// 쓰레기 객체가 되었음
		emp = null;
		emp = new Employee(2);  // 쓰레기 객체가 되었음
		emp = new Employee(3);
			
		System.out.println("emp가 최종적으로 참조하는 사원 번호 :" + emp.eno);
		System.gc();
	}

}
