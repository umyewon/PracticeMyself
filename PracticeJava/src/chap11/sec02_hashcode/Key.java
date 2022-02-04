package chap11.sec02_hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;  // 강제 타입 변환
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// hashCode() 재정의
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;		// number가 동일한 Key 객체는 동일한 해쉬코드 리턴
	}
}
