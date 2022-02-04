package chap11.sec02_hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	// equals() ������
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;  // ���� Ÿ�� ��ȯ
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// hashCode() ������
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;		// number�� ������ Key ��ü�� ������ �ؽ��ڵ� ����
	}
}
