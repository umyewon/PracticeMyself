package chap11.sec01_equals;

public class Member /* extends Object */{ // 명시하지 않아도 Object 자동 상속

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// equals() 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;	// Object 타입을 Member 타입으로 강제 타입 변환
			if(id.equals(member.id)) {	// 다른 Member 객체일지라도 동일한 데이터의 id를 가지고 있으면 true 리턴
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
