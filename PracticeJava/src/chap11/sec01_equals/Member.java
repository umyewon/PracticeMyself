package chap11.sec01_equals;

public class Member /* extends Object */{ // ������� �ʾƵ� Object �ڵ� ���

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// equals() �޼ҵ� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;	// Object Ÿ���� Member Ÿ������ ���� Ÿ�� ��ȯ
			if(id.equals(member.id)) {	// �ٸ� Member ��ü������ ������ �������� id�� ������ ������ true ����
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
