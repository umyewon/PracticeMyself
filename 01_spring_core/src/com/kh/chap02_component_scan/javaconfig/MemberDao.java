package com.kh.chap02_component_scan.javaconfig;

public interface MemberDao {

	/* 회원 번호로 회원 정보를 조회하여 Member 타입을 리턴하는 메소드 */
	Member selectMember(int sequence);
	
	/* 회원 정보를 저장하고 T/F결과를 리턴하는 메소드 */
	boolean insertMember(Member newMember);
	
}
