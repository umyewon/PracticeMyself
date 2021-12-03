package com.kh.chap02_component_scan.javaconfig;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

 // 인터페이스로 메소드를 강제화 한 후 구현하여 사용하면 "강제성이 부여"된다
 
 /* @Component : 스프링 컨테이너가 스캐닝 기능을 이용하여 해당 클래스를 bean으로 등록할 수 있도록 어노테이션을 설정
 * value 속성을 이용하여 bean의 id를 설정할 수 있으며, value는 생략 가능
 * 이름(id)를 설정하지 않으면 Class의 앞 글자를 소문자로 하여 bean을 생성함
 *
 * @Component는 @Controller, @Service, @Repository와 동일한 기능을 가지지만
 * 각 계층을 표현하는 어노테이션은 특정 용도에 맞는 부가적인 기능이 있으므로 계층별로 구분하여 사용
 * 
 * @Component : 스프링에서 관리되는 객체임을 표시하기 위해 사용하는 가장 기본적인 어노테이션 (Bean등록)
 * 				* 계층이 명확하지 않은 경우에는 @Component로 사용
 * @Controller : Web MVC 코드에서 사용되는 어노테이션으로 @RequestMapping 어노테이션은
 * 				  해당 어노테이션이 작성 된 클래스 내에서만 사용 가능함
 * @Service : 비즈니스 로직이 작성 된 클래스에 사용. 추가적인 기능은 지금 없으나 앞으로 제공할 수 있는 가능성이 있으니 명시
 * @Repository : 플랫폼별 예외를 포착하여 DataAccessException으로 변환하여 발생시켜 줌
 * 
 * */

@Component(value="memberDao")
public class MemberDaoImpl implements MemberDao{

	/* DB 연동은 추후에 진행하므로 필드로 테스트 데이터 사용 */
	private Map<Integer, Member> memberMap;
	
	public MemberDaoImpl() {
		memberMap = new HashMap<>();
		
		memberMap.put(1, new Member(1, "user01", "pass01", "홍길동"));
		memberMap.put(2, new Member(2, "user02", "pass02", "유관순"));
	}
	
	/* 매개변수로 전달 받은 회원 번호를 map에서 조회 후 해당 객체 리턴 */
	@Override
	public Member selectMember(int sequence) {
		return memberMap.get(sequence);
	}

	
	/* 매개변수로 전달 받은 회원 정보를 map에 추가하고 성공 실패 여부를 boolean으로 리턴*/
	@Override
	public boolean insertMember(Member newMember) {
		int before = memberMap.size();
		// System.out.println(before); = 2 (회원 추가 전 2명)
		
		memberMap.put(newMember.getSequence(), newMember);
		
		int after = memberMap.size();
		// System.out.println(after); =3 (회원 추가 후 3명)
		
		// after와 before의 크기가 차이 나야 추가가 된 것
		return after > before ? true : false;
	}

}
