package chap06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person ps = new Person("1234567-891234", "����");
		
		System.out.println(ps.nation);
		System.out.println(ps.ssn);
		System.out.println(ps.name);
		
		ps.name = "�浿";
		// ps.nation = "USA";		  �ٽ� �ʱ�ȭ �Ұ���
		// ps.ssn = "1234213-12334";  �ٽ� �ʱ�ȭ �Ұ���
		System.out.println(ps.nation);
		System.out.println(ps.ssn);
		System.out.println(ps.name);
		
	}

}
