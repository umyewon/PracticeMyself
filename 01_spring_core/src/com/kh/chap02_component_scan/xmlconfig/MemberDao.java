package com.kh.chap02_component_scan.xmlconfig;

public interface MemberDao {

	/* 회원 번호로 회원 정보를 조회하는 메소드 */
	Member selectMember(int sequence);
	
	/* 회원 정보를 저장하고 결과를 리턴하는 메소드 */
	boolean insertMember(Member newMember);
	
}
