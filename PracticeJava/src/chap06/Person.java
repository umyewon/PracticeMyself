package chap06;

public class Person {

	final String nation = "Korea";	// �ʵ� ���� �� �ʱ�ȭ
	final String ssn;				// �ֹι�ȣ (�¾�� ���ÿ� ����� ���̱� ������ ������ �������� �ʱ�ȭ)
	String name;					// �̸� (�̸��� ���� �����ϱ� ������ final�� �������� ����(
	
	public Person(String ssn, String name) {
		this.ssn = ssn;		// ������ �ʱ�ȭ
		this.name = name;
		// nation = "America";  => �ʵ� ���� �� �ʱ�ȭ ����� ������ �����ڿ��� �ʱ�ȭ �Ұ���
	}
}
